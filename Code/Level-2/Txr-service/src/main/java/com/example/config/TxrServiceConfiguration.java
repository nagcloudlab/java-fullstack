package com.example.config;

import com.example.repository.AccountRepository;
import com.example.repository.JdbcAccountRepository;
import com.example.service.NEFTTxrService;
import com.example.service.TxrService;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@Import(value = {DatasouceConfiguration.class})
//@ComponentScan(basePackages = {"com.example.repository","com.example.service"})
public class TxrServiceConfiguration {

    // Nag

    @Autowired
    private DataSource dataSource;

    @Bean
    public AccountRepository accountRepository(){
        return  new JdbcAccountRepository(dataSource);
    }

    @Bean
//    @Scope("prototype")
    public TxrService txrService(){
        System.out.println("txrService()");
        return  new NEFTTxrService(accountRepository());
    }

}
