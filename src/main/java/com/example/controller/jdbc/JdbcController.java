package com.example.controller.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * Created by arahansa on 2016-04-20.
 */
@Controller
@RequestMapping("/test/jdbc")
public class JdbcController {

    @Autowired
    private DataSource dataSource;

    @RequestMapping
    @ResponseBody
    public String responseJdBCTest(){
        final List<Map<String, Object>> maps = new JdbcTemplate(dataSource).queryForList("SELECT 1");
        maps.stream().forEach(n->n.keySet().forEach(j-> System.out.println(n.get(j))));
        return "success";
    }
}
