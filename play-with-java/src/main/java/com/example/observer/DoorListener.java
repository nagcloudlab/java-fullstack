package com.example.observer;

public interface DoorListener {
    void on(DoorEvent event);
    void off(DoorEvent event);
}
