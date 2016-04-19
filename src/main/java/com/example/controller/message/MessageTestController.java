package com.example.controller.message;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageTestController {
	
	@RequestMapping(value = "/test/message")
	public String test(Model model) {
		return "message/message";
	}

}
