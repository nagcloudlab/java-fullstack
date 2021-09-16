package com.example.observer;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fan implements  DoorListener{


    public void on(DoorEvent doorEvent){
        log.info("fan on "+doorEvent.getDoorNumber()+","+doorEvent.getFloorNumber());
    }

    public void off(DoorEvent doorEvent){
        log.info("fan on "+doorEvent.getDoorNumber()+","+doorEvent.getFloorNumber());
    }

}
