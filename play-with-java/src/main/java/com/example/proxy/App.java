package com.example.proxy;



import com.example.proxy.Revature;
import com.example.proxy.RevatureProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.List;

@SpringBootApplication
@EnableAspectJAutoProxy
public class App {

    public static void main(String[] args) {

//        // student
//        Revature revature=new RevatureProxy();
//        revature.getTraining("fullstack")
//                .forEach(System.out::println);

        ConfigurableApplicationContext applicationContext=
                SpringApplication.run(App.class);

        SomeService someService=applicationContext.getBean(SomeService.class);
        someService.useCase1();

    }

}
