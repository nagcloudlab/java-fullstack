package com.example.service;


import com.example.entity.Account;
import com.example.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("txrService")
public class TxrServiceImpl implements  TxrService{

    private AccountRepository accountRepository;

    @Autowired
    public TxrServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    // ACID

    @Transactional(
            transactionManager = "transactionManager",
            rollbackFor = {RuntimeException.class},
            noRollbackFor = {},
            timeout = 30,
            isolation = Isolation.READ_COMMITTED,
            propagation = Propagation.REQUIRED
    )
    @Override
    public boolean txr(double amount, String fromAccNum, String toAccNum) {
        Account fromAccount = accountRepository.load(fromAccNum);
        Account toAccount = accountRepository.load(toAccNum);
        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);
        accountRepository.update(fromAccount);
        accountRepository.update(toAccount);
        return true;
    }

}
