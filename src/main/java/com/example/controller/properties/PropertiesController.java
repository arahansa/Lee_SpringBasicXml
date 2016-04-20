package com.example.controller.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class PropertiesController {
	// http://www.baeldung.com/2012/02/06/properties-with-spring/ 가 정확함
	// Properties Xml 은  env 로 못 불러오는 건가..? 
	// 부모/자식 콘테이너의 여부에 따라서 또 @Value 를 쓰기도 못쓰기도 한다.
	
	@Autowired
	private Environment env; // env 는 XML 설정에서 잘 되지가 않는다.
	
	@Autowired 
	private TestPropertyBean testPropertyBean;
	
	@Value( "${test.msg}" )
	private String jdbcUrl;
	
	@RequestMapping(value="/test/properties", produces="text/html;charset=UTF-8")
	@ResponseBody
	public String propertiesTest(){
		return "hello~ : "+jdbcUrl + " <br> , 테스트 프로퍼티 빈 정보 : " +  testPropertyBean;
	}

}
