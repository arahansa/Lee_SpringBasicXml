package com.example.controller.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.form.FirstDomain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/test")
@Controller
public class FirstFormController {
	
	@RequestMapping(value = "/form", method=RequestMethod.GET)
	public String testForm() {
		return "test/form";
	}
	
	// name, age 
	@RequestMapping(value="/save" , method=RequestMethod.POST)
	public String test2(@ModelAttribute FirstDomain firstDomain){
		log.info("first Domain : {} ", firstDomain );
		return "test/saveResult";
	}
	
	@RequestMapping(value="/save2" , method=RequestMethod.POST)
	public String test3(FirstDomain firstDomain, Model model){
		log.info("first Domain : {} ", firstDomain );
		model.addAttribute("firstDomain", firstDomain);
		return "test/saveResult";
	}
	
	@RequestMapping(value="/save3" , method=RequestMethod.POST)
	public String test3(String name, int age , Model model){
		FirstDomain firstDomain = new FirstDomain(name, age);
		model.addAttribute("firstDomain", firstDomain);
		log.info("Lombok Test : "+firstDomain.getName());
		return "test/saveResult";
	}

}
