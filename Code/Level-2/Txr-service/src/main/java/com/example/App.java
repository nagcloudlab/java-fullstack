package com.example;

import com.example.config.TxrServiceConfiguration;
import com.example.service.TxrService;
import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    private final static Logger logger=Logger.getLogger("txr-service");

    public static void main(String[] args) {

        //------------------------------------
        // init / booting
        //------------------------------------

        // create spring-container a.k.a BeanFactory -> application-context
        ConfigurableApplicationContext applicationContext=null;
        applicationContext=new AnnotationConfigApplicationContext(TxrServiceConfiguration.class);

        System.out.println("-".repeat(50));
        //------------------------------------
        // use
        //------------------------------------

        TxrService txrService=applicationContext.getBean("txrService",TxrService.class);

        txrService.txr(1000.00,"1","2");
        System.out.println();
        txrService.txr(1000.00,"2","1");
        System.out.println("-".repeat(50));

        //------------------------------------
        // destroy
        //------------------------------------

        applicationContext.close();

    }

}
