package com.example.factory.wheel;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class MRFWheel implements  Wheel{

    public MRFWheel() {
        log.info("MRFWheel instance created..");
    }

    public void rotate(){
        log.info("MRF wheel rotating...");
    }

}
