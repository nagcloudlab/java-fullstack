package com.example.configuration;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {

    @Bean(name="dataSource")
    @Scope("singleton")
    @Lazy(false)
    public DataSource dataSource(){

        BasicDataSource dataSource=new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/accounts_db");
        dataSource.setUsername("root");
        dataSource.setPassword("root1234");

        return  dataSource;

    }

}
