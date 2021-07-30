package com.example.configuration;

import com.example.repository.AccountRepository;
import com.example.repository.JdbcAccountRepository;
import com.example.repository.JpaAccountRepository;
import com.example.service.NEFTTxrService;
import com.example.service.TxrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@Import(value = {DatasourceConfiguration.class,JPAConfiguration.class})
public class TxrServiceConfiguration {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Bean(name="accountRepository")
    @Scope("singleton")
    @Lazy(false)
    public AccountRepository accountRepository(){
       return new JpaAccountRepository();
    }

    @Bean(name="txrService")
    @Scope("singleton")
    @Lazy(false)
    public TxrService txrService(){
        return new NEFTTxrService(accountRepository());
    }


}
