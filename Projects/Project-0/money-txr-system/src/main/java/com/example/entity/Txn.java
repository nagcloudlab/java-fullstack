package com.example.entity;

import java.time.LocalDateTime;

public class Txn {

	private int id;
	private double amount;
	private LocalDateTime dateTime;
	private TxnType type;
	private Account account;

	public Txn(double amount, LocalDateTime dateTime, TxnType type) {
		super();
		this.amount = amount;
		this.dateTime = dateTime;
		this.type = type;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public TxnType getType() {
		return type;
	}

	public void setType(TxnType type) {
		this.type = type;
	}

}
