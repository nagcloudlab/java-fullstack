package com.example.configuration;

import com.example.repository.AccountRepository;
import com.example.repository.JpaAccountRepository;
import com.example.service.TxrService;
import com.example.service.TxrServiceImpl;
import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Configuration
@Import(value={JpaConfiguration.class})
@ComponentScan(basePackages = {"com.example"})
public class TxrServiceConfiguration {


//    @PersistenceContext
//    EntityManager entityManager;
//
//    @Bean(name="accountRepository")
//    @Scope("singleton")
//    @Lazy(false)
//    public AccountRepository accountRepository(){
//        return new JpaAccountRepository(entityManager);
//    }
//
//    @Bean(name="txrService")
//    @Scope("singleton")
//    @Lazy(false)
//    public TxrService txrService(){
//        return new TxrServiceImpl(accountRepository());
//    }

}
