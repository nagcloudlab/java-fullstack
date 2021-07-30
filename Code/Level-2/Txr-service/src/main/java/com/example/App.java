package com.example;

import com.example.configuration.TxrServiceConfiguration;
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

        ConfigurableApplicationContext applicationContext=null;
        applicationContext=new AnnotationConfigApplicationContext(TxrServiceConfiguration.class);

        //------------------------------------
        // use
        //------------------------------------

        try {
            TxrService txrService = applicationContext.getBean(TxrService.class);
            txrService.txr(100, "1", "2");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        //------------------------------------
        // destroy
        //------------------------------------


    }

}
