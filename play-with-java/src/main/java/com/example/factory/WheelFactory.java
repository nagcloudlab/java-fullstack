package com.example.factory;

import com.example.factory.wheel.MRFWheel;
import com.example.factory.wheel.Wheel;

// Factory Class
public class WheelFactory {

    // Factory Method
    public static Wheel getWheel(String wheelBrand){
        MRFWheel mrfWheel=new MRFWheel();
        return  mrfWheel;
    }

}
