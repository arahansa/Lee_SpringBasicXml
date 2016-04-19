package com.example.controller.form.validation;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.form.FirstDomain;

import lombok.extern.slf4j.Slf4j;


/**
 * 최범균님 스프링 4.0 책  333페이지 참조
 */
@Slf4j
@Controller
public class ValidationController {
	
	@RequestMapping(value = "/test/validation/form", method=RequestMethod.GET)
	public String testForm() {
		return "form/validation/form";
	}
	
	// name, age 
	@RequestMapping(value="/test/validation/save" , method=RequestMethod.POST)
	public String test2(@Valid @ModelAttribute FirstDomain firstDomain, BindingResult result){
		// 밸리데이션 에러가 있을 때는 다시 폼으로 돌아가야 한다. 
		if(result.hasErrors()){
			log.debug("ErrorField : {} ", result.getFieldError());
			return "form/validation/form";	
		}
		log.info("first Domain : {} ", firstDomain );
		return "form/validation/saveResult";
	}
	
	
	// 스프링 FORM 태그 사용
	// 최범균님 책 331페이지에 코드 규약이 나옴
	@RequestMapping(value = "/test/validation/form2", method=RequestMethod.GET)
	public String testForm2(@ModelAttribute FirstDomain firstDomain) {
		return "form/validation/form2";
	}
	
	// name, age 
	@RequestMapping(value="/test/validation/save2" , method=RequestMethod.POST)
	public String test22(@Valid @ModelAttribute FirstDomain firstDomain, BindingResult result){
		// 밸리데이션 에러가 있을 때는 다시 폼으로 돌아가야 한다. 
		if(result.hasErrors()){
			log.debug("ErrorField : {} ", result.getFieldError());
			return "form/validation/form2";	
		}
		log.info("first Domain : {} ", firstDomain );
		return "form/validation/saveResult";
	}

}
