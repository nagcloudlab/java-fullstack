package com.example.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DoorEvent {
    private int doorNumber;
    private int floorNumber;
}
