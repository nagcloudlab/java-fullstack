package com.example;

import com.example.service.TxrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TxrServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(TxrServiceApplication.class,args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(TxrService txrService){
//        return (args)->{
//            txrService.txr(100,"1","2");
//        };
//    }


}
