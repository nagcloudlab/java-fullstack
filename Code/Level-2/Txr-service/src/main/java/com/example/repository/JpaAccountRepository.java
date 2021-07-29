package com.example.repository;

import com.example.model.Account;
import org.apache.log4j.Logger;

public class JpaAccountRepository implements AccountRepository {

    private final static Logger logger=Logger.getLogger("txr-service");

    public JpaAccountRepository() {
        logger.info("JpaAccountRepository component instantiated..");
    }

    @Override
    public Account load(String number) {
        logger.info("loading account "+number);
        return new Account(number,2000.00);
    }

    @Override
    public Account update(Account account) {
        logger.info("loading account "+account.getNumber());
        return account;
    }
}
