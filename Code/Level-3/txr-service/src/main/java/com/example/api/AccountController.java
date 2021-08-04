package com.example.api;

import com.example.entity.Account;
import com.example.entity.Txn;
import com.example.exception.NoAccountException;
import com.example.repository.AccountRepository;
import com.example.repository.TxnRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
public class AccountController {

    private AccountRepository accountRepository;
    private TxnRepository txnRepository;

    public AccountController(AccountRepository accountRepository, TxnRepository txnRepository) {
        this.accountRepository = accountRepository;
        this.txnRepository = txnRepository;
    }

    @GetMapping("/api/accounts")
    public List<Account> getAll(){
        return accountRepository.findAll();
    }

    @GetMapping("/api/accounts/{number}")
    public Account getOne(@PathVariable String number){
        return accountRepository.findById(number).orElseThrow(()-> new NoAccountException(number));
    }


    @GetMapping("/api/accounts/{number}/txns")
    public List<Txn> getTxns(@PathVariable String number,@RequestParam(name="limit",required = false) Integer limit){
        return accountRepository.findById(number).get().getTxns();
    }


    @GetMapping("/api/txns/{txnId}")
    public Txn getTxn(@PathVariable int txnId){
        return txnRepository.findById(txnId).get();
    }

}
