package com.example.service;

import com.example.model.Account;
import com.example.repository.AccountRepository;
import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;


public class NEFTTxrService implements TxrService {

    private final static Logger logger = Logger.getLogger("txr-service");

    private AccountRepository accountRepository;

    public NEFTTxrService(AccountRepository accountRepository) {
        this.accountRepository=accountRepository;
        logger.info("NEFTTxrService component instantiated");
    }

    @Transactional
    @Override
    public boolean txr(double amount, String fromAccNum, String toAccNum) {
        logger.info("txr initiated");
        Account fromAccount = accountRepository.load(fromAccNum);
        Account toAccount = accountRepository.load(toAccNum);
        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);
        accountRepository.update(fromAccount);

        if(true){
            throw new IllegalStateException("oops");
        }

        accountRepository.update(toAccount);
        logger.info("txr completed");
        return true;
    }

}
