package com.example.repository;

import com.example.model.Account;
import org.apache.log4j.Logger;

public class JdbcAccountRepository implements AccountRepository {

    private final static Logger logger=Logger.getLogger("txr-service");

    public JdbcAccountRepository() {
        logger.info("JdbcAccountRepository component instantiated..");
    }

    @Override
    public Account load(String number) {
        logger.info("loading account "+number);
        //...
        return new Account(number,1000.00);
    }

    @Override
    public Account update(Account account) {
        logger.info("updating account "+account.getNumber());
        //..
        return account;
    }
}
