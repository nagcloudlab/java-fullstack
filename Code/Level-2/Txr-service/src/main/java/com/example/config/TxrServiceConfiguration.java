package com.example.config;

import com.example.repository.AccountRepository;
import com.example.repository.JdbcAccountRepository;
import com.example.service.NEFTTxrService;
import com.example.service.TxrService;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.example"})
@PropertySource("classpath:db.properties")
public class TxrServiceConfiguration {


    @Value("${db.driver}") // SPEL
    private String dbDriverClass;
    @Value("${db.url}")
    private String dbUrl;
    @Value("${db.username}")
    private String dbUser;
    @Value("${db.password}")
    private String dbPassword;

    @Bean
    public DataSource dataSource(){
        System.out.println("datasource()");
        BasicDataSource dataSource=new BasicDataSource();
        dataSource.setDriverClassName(dbDriverClass);
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbUser);
        dataSource.setPassword(dbPassword);
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
