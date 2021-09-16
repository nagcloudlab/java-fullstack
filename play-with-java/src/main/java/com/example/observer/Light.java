package com.example.observer;

import lombok.extern.slf4j.Slf4j;

// Observers / Listeners

@Slf4j
public class Light implements  DoorListener {

    public void on(DoorEvent doorEvent){
      log.info("light on "+doorEvent.getDoorNumber()+","+doorEvent.getFloorNumber());
    }

    public void off(DoorEvent doorEvent){
        log.info("light off "+doorEvent.getDoorNumber()+","+doorEvent.getFloorNumber());
    }

}
