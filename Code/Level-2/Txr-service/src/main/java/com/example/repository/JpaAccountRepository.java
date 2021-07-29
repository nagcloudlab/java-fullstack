package com.example.repository;

import com.example.model.Account;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("jpa")
public class JpaAccountRepository implements AccountRepository {

    private final static Logger logger=Logger.getLogger("txr-service");

    public JpaAccountRepository() {
        logger.info("JpaAccountRepository component instantiated..");
    }

    @Override
    public Account load(String number) {
        logger.info("JPA : loading account "+number);
        return new Account(number,2000.00);
    }

    @Override
    public Account update(Account account) {
        logger.info("JPA : loading account "+account.getNumber());
        return account;
    }
}
