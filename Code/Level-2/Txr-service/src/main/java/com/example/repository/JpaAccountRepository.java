package com.example.repository;

import com.example.model.Account;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component("jpaAccountRepository")
@Qualifier("jpa")
@Scope("singleton")
@Lazy(false)
public class JpaAccountRepository implements AccountRepository {

    private final static Logger logger=Logger.getLogger("txr-service");

    private DataSource dataSource;

    @Autowired
    public JpaAccountRepository(DataSource dataSource) {
        this.dataSource=dataSource;
        logger.info("JdbcAccountRepository component instantiated..");
    }

    @Override
    public Account load(String number) {
        logger.info("JPA : loading account "+number);
//        try {
//            Connection connection=dataSource.getConnection();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        return new Account(number,1000.00);
    }

    @Override
    public Account update(Account account) {
        logger.info("JPA : updating account "+account.getNumber());
        //..
        return account;
    }
}
