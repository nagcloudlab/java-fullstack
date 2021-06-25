package com.example;

/*
 * 
 * 
 * 
 * 
 * 
 * 
 */

class AccountBalanceException extends RuntimeException {
	public AccountBalanceException(String message) {
		super(message);
	}
}

//---------------------------------------------------
// finance-team : TransferService
//---------------------------------------------------

class TransferService {
	public boolean transfer(double amount, String fromAccNum, String toAccNum) {

		// Load from & to Account details
		double fromAccBalance = 1000.00;

		// debit & credit
		if (fromAccBalance < amount) {
			throw new AccountBalanceException("no enough funds");
		}
		// update both accounts

		return true;

	}
}

//---------------------------------------------------
//finance-team  : TransferService
//---------------------------------------------------

class Audit {

	TransferService transferService = new TransferService();

	public void doTxr() {

		double amount = 5000.00;
		String fromAccNum = "1";
		String toAccNum = "2";

		try {
			transferService.transfer(amount, fromAccNum, toAccNum);
			System.out.println("txr success");
		} catch (AccountBalanceException e) {
			System.out.println("Ex-" + e.getMessage());
			e.printStackTrace();
		}

	}
}

public class Example4 {

	public static void main(String[] args) {

		Audit audit = new Audit();
		audit.doTxr();

	}

}
