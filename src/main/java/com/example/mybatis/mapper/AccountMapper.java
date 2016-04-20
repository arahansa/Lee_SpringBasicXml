package com.example.mybatis.mapper;

import java.util.List;

import com.example.mybatis.domain.Account;

public interface AccountMapper {
	
	Account getAccountByUsername(String username);
	
	void insertAccount(Account account);
	
	List<Account> getAccountList();
}
