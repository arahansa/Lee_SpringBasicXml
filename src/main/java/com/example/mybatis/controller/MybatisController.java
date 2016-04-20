package com.example.mybatis.controller;

import com.example.mybatis.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.mybatis.mapper.AccountMapper;

@Controller
public class MybatisController {

	// https://github.com/mybatis/jpetstore-6
	
	@Autowired
	private AccountMapper accountMapper;

	@RequestMapping(value = "/test/mybatis/list")
	public String test(Model model) {
		model.addAttribute("accountList", accountMapper.getAccountList());
		return "mybatis/list";
	}
	
	
	@RequestMapping(value = "/test/mybatis/insert")
	public String insert(Account account, Model model) {
		accountMapper.insertAccount(account);
		return "redirect:list";
	}

}
