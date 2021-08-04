package com.example.api;

import com.example.entity.Account;
import com.example.entity.Txn;
import com.example.exception.NoAccountException;
import com.example.repository.AccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    private AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
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
    public List<Txn> getTxns(@PathVariable String number,@RequestParam(name="limit",required = false) int limit){
        if(limit>0){
            //
        }else{
            // all txns
        }
       return null;
    }


    @GetMapping("/api/accounts/{number}/txns/{txnId}")
    public Txn getTxn(@PathVariable String number,@PathVariable int txnId){
        return null;
    }

}
