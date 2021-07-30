package com.example.service;

import com.example.model.Account;
import com.example.repository.AccountRepository;
import com.example.repository.JdbcAccountRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("txrService")
@Service("txrService")
@Scope("singleton")
@Lazy(false)
public class NEFTTxrService implements TxrService {

    private final static Logger logger = Logger.getLogger("txr-service");

    private AccountRepository accountRepository;

    @Autowired // ( type | Qualifier | name)
    public NEFTTxrService(@Qualifier("jdbc") AccountRepository accountRepository) {
        this.accountRepository=accountRepository;
        logger.info("NEFTTxrService component instantiated");
    }


    @PostConstruct
    public void init(){
        // one time init,
        System.out.println("init()");
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("cleanup()");
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
