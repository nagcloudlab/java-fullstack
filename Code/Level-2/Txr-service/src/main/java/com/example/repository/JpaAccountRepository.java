package com.example.repository;

import com.example.entity.Account;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//@Component
@Repository
public class JpaAccountRepository implements AccountRepository {

    private final static Logger logger=Logger.getLogger("txr-service");

    @PersistenceContext
    EntityManager entityManager;


    public JpaAccountRepository(/*EntityManager entityManager*/) {
        //this.entityManager = entityManager;
        logger.info("AccountRepository component instantiated..");
    }

//
//    public void setEntityManager(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }

    @Override
    public Account load(String number) {
        logger.info("loading account " + number);
        return entityManager.find(Account.class,number);
    }

    @Override
    public Account update(Account account) {
        logger.info("updating account "+account.getNumber());
        return entityManager.merge(account);
    }
}
