package com.example.service;

import com.example.entity.Account;
import com.example.entity.Txn;
import com.example.entity.TxnType;
import com.example.exception.BalanceException;
import com.example.exception.NoAccountException;
import com.example.repository.AccountRepository;
import com.example.repository.TxnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Optional;

@Service
public class TransferServiceImpl implements  TransferService {

    private AccountRepository accountRepository;
    private TxnRepository txnRepository;

    public TransferServiceImpl(AccountRepository accountRepository, TxnRepository txnRepository) {
        this.accountRepository = accountRepository;
        this.txnRepository = txnRepository;
    }

    @Transactional
    @Override
    public TxrStatus txr(double amount, String fromAccNum, String toAccNum) {

       Optional<Account> optionalFromAccount= accountRepository.findById(fromAccNum);
       Account fromAccount= optionalFromAccount.orElseThrow(()->new NoAccountException(fromAccNum));

       Optional<Account> optionalToAccount= accountRepository.findById(toAccNum);
       Account toAccount= optionalToAccount.orElseThrow(()->new NoAccountException(toAccNum));

       if(fromAccount.getBalance()<amount)
           throw new BalanceException("balance : "+fromAccount.getBalance());

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


       accountRepository.save(fromAccount);
       accountRepository.save(toAccount);

       txnRepository.save(debitTxn);
       txnRepository.save(creditTxn);

        return new TxrStatus(0,Status.SUCCESS);
    }


}
