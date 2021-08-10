package com.example.api;

public class TxrRequest {
	
	double amount;
	String fromAccNum;
	String toAccNum;
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getFromAccNum() {
		return fromAccNum;
	}
	public void setFromAccNum(String fromAccNum) {
		this.fromAccNum = fromAccNum;
	}
	public String getToAccNum() {
		return toAccNum;
	}
	public void setToAccNum(String toAccNum) {
		this.toAccNum = toAccNum;
	}
	@Override
	public String toString() {
		return "TxrRequest [amount=" + amount + ", fromAccNum=" + fromAccNum + ", toAccNum=" + toAccNum + "]";
	}
	
	
	
	

}
