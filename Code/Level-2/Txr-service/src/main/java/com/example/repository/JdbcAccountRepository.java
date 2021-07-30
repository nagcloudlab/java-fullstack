package com.example.repository;

import com.example.model.Account;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;


public class JdbcAccountRepository implements AccountRepository {

    private final static Logger logger=Logger.getLogger("txr-service");

    private JdbcTemplate jdbcTemplate;

    public JdbcAccountRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate=jdbcTemplate;
        logger.info("JdbcAccountRepository component instantiated..");
    }

    @Override
    public Account load(String number) {
        logger.info("JDBC : loading account " + number);
        String sql = "select * from ACCOUNTS where number=?";
        return jdbcTemplate.queryForObject(sql,(rs,i)->{
            return  new Account(rs.getString(1),rs.getDouble(2));
        },number);
    }

    @Override
    public Account update(Account account) {
        logger.info("JDBC : updating account "+account.getNumber());
        String sql="update ACCOUNTS set balance=? where number=?";
        jdbcTemplate.update(sql,account.getBalance(),account.getNumber());
        return account;
    }
}
