package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DatasourceConfiguration {

    @Bean(name = "dataSource")
    @Scope("singleton")
    @Lazy(false)
    public DataSource dataSource(){

            BasicDataSource dataSource=new BasicDataSource();
            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://localhost:3306/accounts_db");
            dataSource.setUsername("root");
            dataSource.setPassword("root1234");

            return  dataSource;

    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }


}
