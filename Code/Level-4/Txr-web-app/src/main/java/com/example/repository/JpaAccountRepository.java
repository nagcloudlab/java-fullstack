package com.example.repository;

import com.example.configuration.JpaConfiguration;
import com.example.entity.Account;

import javax.persistence.EntityManager;

public class JpaAccountRepository implements AccountRepository{

    @Override
    public Account findById(String number) {
        EntityManager em= JpaConfiguration.em();
        Account account=em.find(Account.class,number);
        em.close();
        return account;
    }

    @Override
    public Account update(Account account) {
        EntityManager em= JpaConfiguration.em();
        em.getTransaction().begin();
        Account updatedAccount=em.merge(account);
        em.getTransaction().commit();
        em.close();
        return updatedAccount;
    }

}
