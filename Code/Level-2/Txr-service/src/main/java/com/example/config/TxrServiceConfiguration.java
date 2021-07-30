package com.example.config;

import com.example.repository.AccountRepository;
import com.example.repository.JdbcAccountRepository;
import com.example.service.NEFTTxrService;
import com.example.service.TxrService;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.example"})
public class TxrServiceConfiguration {

    @Bean
    public DataSource dataSource(){
        System.out.println("datasource()");
        BasicDataSource dataSource=new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/accounts_db");
        dataSource.setUsername("root");
        dataSource.setPassword("root1234");
        dataSource.setMaxActive(3);
        return  dataSource;
    }

//    @Bean
//    public AccountRepository accountRepository(){
//        return  new JdbcAccountRepository(dataSource());
//    }
//
//    @Bean
//    public TxrService txrService(){
//        return  new NEFTTxrService(accountRepository());
//    }

}
