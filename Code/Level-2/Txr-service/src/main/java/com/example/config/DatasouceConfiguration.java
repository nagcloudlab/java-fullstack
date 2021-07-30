package com.example.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:txr-service-dev.properties")
public class DatasouceConfiguration {


    @Value("${db.driver}") // SPEL
    private String dbDriverClass;
    @Value("${db.url}")
    private String dbUrl;
    @Value("${db.user}")
    private String dbUser;
    @Value("${db.password}")
    private String dbPassword;

//    @Value("#{systemProperties['port']}")  // -Dport=8181
//    private int port;

    //@Profile("dev")
    @Bean
    @Description("Data-source for the underlying RDB we are using")
    public DataSource dataSourceForDev(){
        System.out.println("datasource()");
        BasicDataSource dataSource=new BasicDataSource();
        dataSource.setDriverClassName(dbDriverClass);
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbUser);
        dataSource.setPassword(dbPassword);
        dataSource.setMaxActive(3);
        return  dataSource;
    }


}
