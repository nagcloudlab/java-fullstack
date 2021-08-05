package com.example;

import com.example.service.TodoFilter;
import com.example.service.TodoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.example"})
@EnableAutoConfiguration // ( presence/absence of JAR | bean | property )
@EnableJpaRepositories
public class TodoServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(TodoServiceApplication.class, args); // sprig context

    }

    @Bean
    public CommandLineRunner command(TodoService todoService){
        return  (args)->{

//            todoService.getTodos(TodoFilter.ALL).forEach(todo->{
//                System.out.println(todo);
//            });

//            todoService.createTodo("Title-1");

        };
    }



}

