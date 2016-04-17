package com.example.controller.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.xml.internal.ws.api.pipe.Engine;

@Controller
public class PropertiesController {
	
	@Autowired
	private Environment env;
	
	@RequestMapping("/test/properties")
	@ResponseBody
	public String propertiesTest(){
		return "hello~ " + env.getProperty("test.msg");
	}

}
