package com.example.service;

import java.util.Date;

import com.example.entity.Account;
import com.example.entity.Txn;
import com.example.entity.TxnType;
import com.example.repository.AccountRepository;
import com.example.repository.TxnRepository;

public class TxrServiceImpl implements TxrService {

    AccountRepository accountRepository;
    TxnRepository txnRepository;

   

    public TxrServiceImpl(AccountRepository accountRepository, TxnRepository txnRepository) {
		super();
		this.accountRepository = accountRepository;
		this.txnRepository = txnRepository;
	}



	@Override
    public void txr(double amount, String fromAccNum, String toAccNum) {
       
		Account fromAccount=accountRepository.findById(fromAccNum);
        Account toAccount=accountRepository.findById(toAccNum);
        
        fromAccount.setBalance(fromAccount.getBalance()-amount);
        toAccount.setBalance(toAccount.getBalance()+amount);
        
        Txn debitTxn=new Txn();
        debitTxn.setType(TxnType.DEBIT);
        debitTxn.setAccount(fromAccount);
        debitTxn.setAmount(amount);
        debitTxn.setDate(new Date());

        Txn creditTxn=new Txn();
        creditTxn.setType(TxnType.CREDIT);
        creditTxn.setAccount(toAccount);
        creditTxn.setAmount(amount);
        creditTxn.setDate(new Date());
        
        
        accountRepository.update(fromAccount);
        accountRepository.update(toAccount);
        

        txnRepository.save(debitTxn);
        txnRepository.save(creditTxn);
        
    }
}
