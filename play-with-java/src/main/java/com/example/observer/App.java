package com.example.observer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class App {

    public static void main(String[] args)throws  InterruptedException {
//
//        Door door=new Door();
//        door.addDoorListener(new Light());
//        Fan fan=new Fan();
//        door.addDoorListener(fan);
//
//        TimeUnit.SECONDS.sleep(3);
//
//        door.open();
//
//        TimeUnit.SECONDS.sleep(3);
//
//        door.close();
//
//        door.removeDoorListener(fan);
//        TimeUnit.SECONDS.sleep(3);
//
//        door.open();

        //----------------------------------------------

        ConfigurableApplicationContext applicationContext=
                SpringApplication.run(App.class);

        TrainerModule trainerModule=applicationContext.getBean(TrainerModule.class);
        trainerModule.doTraining();



    }
}
