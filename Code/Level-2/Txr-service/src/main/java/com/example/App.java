package com.example;

import com.example.configuration.TxrServiceConfiguration;
import com.example.service.TxrService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //------------------------------------------------------------
        // init
        //------------------------------------------------------------

        ConfigurableApplicationContext applicationContext=null;
        applicationContext=new AnnotationConfigApplicationContext(TxrServiceConfiguration.class);

        //------------------------------------------------------------
        // use
        //------------------------------------------------------------

        Scanner scanner=new Scanner(System.in);


        System.out.println("Enter From Account Number?");
        String fromAccNum= scanner.nextLine();

        System.out.println("Enter To Account Number?");
        String toAccNum= scanner.nextLine();

        System.out.println("Enter Amount?");
        double amount= scanner.nextDouble();


        TxrService txrService= applicationContext.getBean("txrService", TxrService.class);
        txrService.txr(amount,fromAccNum,toAccNum);


        //------------------------------------------------------------
        // destroy
        //------------------------------------------------------------
        applicationContext.close();
    }

}
