package com.example.service;

public class AccountNotFoundExeption extends RuntimeException {

	public AccountNotFoundExeption(String accNum) {
		super(accNum);
	}

}
