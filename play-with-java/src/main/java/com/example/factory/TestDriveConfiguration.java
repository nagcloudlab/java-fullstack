package com.example.factory;

import com.example.factory.car.Car;
import com.example.factory.WheelFactory;
import com.example.factory.wheel.Wheel;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class TestDriveConfiguration {

    @Bean
    public Wheel wheel(){
        return WheelFactory.getWheel("MRF");
    }

    @Bean
    public Car car(){
        return  new Car(wheel());
    }

}
