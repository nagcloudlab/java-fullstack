package com.example.repository;

import com.example.entity.Account;

public interface AccountRepository {
	
	Account load(String accNumber);
	void update(Account account);

}
