package com.example.service;

import com.example.entity.Account;
import com.example.exception.BalanceException;
import com.example.exception.NoAccountException;
import com.example.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class TransferServiceImpl implements  TransferService {

    private AccountRepository accountRepository;

    @Autowired
    public TransferServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
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

       // insert rows into TXN_HISTORY table

       accountRepository.save(fromAccount);
       accountRepository.save(toAccount);

        return new TxrStatus(0,Status.SUCCESS);
    }


}
