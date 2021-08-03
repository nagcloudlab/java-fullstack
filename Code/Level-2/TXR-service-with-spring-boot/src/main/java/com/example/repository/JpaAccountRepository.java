package com.example.repository;


import com.example.entity.Account;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class JpaAccountRepository implements AccountRepository {
    @PersistenceContext
    EntityManager entityManager;

    public JpaAccountRepository( ){
    }

    @Override
    public Account load(String number) {
        return entityManager.find(Account.class,number);
    }

    @Override
    public Account update(Account account) {
        return entityManager.merge(account);
    }
}
