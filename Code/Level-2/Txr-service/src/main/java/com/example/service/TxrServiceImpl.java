package com.example.service;

import com.example.entity.Account;
import com.example.repository.AccountRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//@Component(value="txrService")
@Service("txrService")
public class TxrServiceImpl implements  TxrService{

    private final static Logger logger = Logger.getLogger("txr-service");


    private AccountRepository accountRepository;

    @Autowired
    public TxrServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
        logger.info("TxrService component instantiated");
    }

    @Transactional(
            transactionManager = "transactionManager",
            rollbackFor = RuntimeException.class,
            timeout = 30
    )
    @Override
    public boolean txr(double amount, String fromAccNum, String toAccNum) {
        logger.info("txr initiated");

        Account fromAccount = accountRepository.load(fromAccNum);
        Account toAccount = accountRepository.load(toAccNum);
        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);
        accountRepository.update(fromAccount);

//        if(true){
//            throw new IllegalStateException("oops");
//        }

        accountRepository.update(toAccount);
        logger.info("txr completed");

        return true;
    }

}
