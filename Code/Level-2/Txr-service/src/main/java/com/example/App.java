package com.example;

import com.example.configuration.TxrServiceConfiguration;
import com.example.service.TxrService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

        TxrService txrService= applicationContext.getBean("txrService", TxrService.class);
        txrService.txr(100,"1","2");


        //------------------------------------------------------------
        // destroy
        //------------------------------------------------------------
        applicationContext.close();
    }

}
