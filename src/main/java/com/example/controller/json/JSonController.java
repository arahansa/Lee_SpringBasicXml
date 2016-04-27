package com.example.controller.json;

import lombok.Data;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by KangYong on 2016-04-27.
 */
@Slf4j
@RequestMapping("/test")
@Controller
public class JSonController {

    @RequestMapping("/json")
    @ResponseBody
    public JSONTest createJsonResponse(){
        return JSONTest.of("arahansa", 99);
    }

    @Data
    @Value(staticConstructor = "of")
    static class JSONTest{
        private String name;
        private int age;
    }


}
