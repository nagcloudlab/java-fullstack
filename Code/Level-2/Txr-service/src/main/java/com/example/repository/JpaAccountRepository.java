package com.example.repository;

import com.example.model.Account;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class JpaAccountRepository implements AccountRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Account load(String number) {
        return entityManager.find(Account.class,number);
    }

    @Override
    public Account update(Account account) {
        return entityManager.merge(account);
    }
}
