package com.example.service;

import com.example.model.Account;
import com.example.repository.AccountRepository;
import com.example.repository.JdbcAccountRepository;
import org.apache.log4j.Logger;

public class NEFTTxrService implements TxrService {

    private final static Logger logger = Logger.getLogger("txr-service");

    private AccountRepository accountRepository;

    public NEFTTxrService(AccountRepository accountRepository) {
        this.accountRepository=accountRepository;
        logger.info("NEFTTxrService component created");
    }

    @Override
    public boolean txr(double amount, String fromAccNum, String toAccNum) {
        logger.info("txr initiated");
        Account fromAccount = accountRepository.load(fromAccNum);
        Account toAccount = accountRepository.load(toAccNum);
        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);
        accountRepository.update(fromAccount);
        accountRepository.update(toAccount);
        logger.info("txr completed");
        return true;
    }

}
