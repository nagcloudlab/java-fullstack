package com.example.observer;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;


@Slf4j
public class Door {

    private List<DoorListener> doorListeners=new ArrayList<>();

    public void addDoorListener(DoorListener doorListener){
        this.doorListeners.add(doorListener);
    }

    public void removeDoorListener(DoorListener doorListener){
        this.doorListeners.remove(doorListener);
    }

    public void open(){
        log.info("door opened...");
        DoorEvent doorEvent=new DoorEvent(2,1);
        this.doorListeners.forEach(doorListener -> doorListener.on(doorEvent)); // sync notification
        // obserbableStream.next(event) // Async Notification
    }

    public void close(){
        log.info("door closed");
        DoorEvent doorEvent=new DoorEvent(2,1);
        this.doorListeners.forEach(doorListener -> doorListener.off(doorEvent));
    }

}
