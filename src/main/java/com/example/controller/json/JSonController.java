package com.example.controller.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * Created by KangYong on 2016-04-27.
 */
@Slf4j
@RequestMapping("/test")
@Controller
public class JSonController {


    @RequestMapping(value="/jsonreq", method = RequestMethod.GET)
    public String jsonReqform(){
        return "json/form";
    }

    @RequestMapping(value="/jsonreq", method = RequestMethod.POST)
    @ResponseBody
    public JSONTest jsonPostForm(@RequestBody JSONTest jsonTest) throws JsonProcessingException {
        log.info("jsonTest: {} ", jsonTest);
        return jsonTest;
    }


    @RequestMapping("/json")
    @ResponseBody
    public JSONTest createJsonResponse(){
        return new JSONTest("arahansa", 99);
    }

    @RequestMapping("/jsonmap")
    @ResponseBody
    public Map<String, Object> createMapResponse(){
        Map<String, Object> result = new HashMap<>();
        result.put("테스트",new JSONTest("이름",11));
        return result;
    }

    @RequestMapping("/jsonlist")
    @ResponseBody
    public List<JSONTest> createListResponse(){
        List<JSONTest> result = Arrays.asList(
                new JSONTest("이름", 11), new JSONTest("하하", 33), new JSONTest("후후", 44));
        return result;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class JSONTest{
        private String name;
        private int age;
    }


}
