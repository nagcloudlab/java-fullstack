package com.example.factory.car;

import com.example.factory.wheel.Wheel;
import lombok.extern.slf4j.Slf4j;


/*

    design & performance issues
    -----------------------------


     => dependent's class impln + dependency's class  ( tight-coupling )
     => too many dependency instances created & destroyed..
     => Unit-testing not possible


     why these issues ?

     => dependent itself creating it's own dependency

     solution:

     => Don't create dependency in depentent's home, get from 'factory'  =>  Factory design pattern

    limitation with factory-pattern:

     => dependent tightly-coupled with factory-location.

    best solution:

    => Dont'create & lookup-on-factory , get / inject by 'third-party'

                                            i.e Dependency inversion principle
    how to implement Dependency inversion ?

    many ways :

        => constructor
        => setter


    OO principles a.k.a SOLID Principles

    => Single Responsibility
    => Open Closed Principle
    => Liskov Substitution Principle
    => Interface segregation Principle
    => Dependency inversion principle


 */


@Slf4j
public class Car {

    Wheel wheel;

    public Car(Wheel wheel) {
        this.wheel=wheel;
        log.info("Car instance created...");
    }

    public void setWheel(Wheel wheel){
        this.wheel=wheel;
    }

    public void move(){
        wheel.rotate();
        log.info("car moving");
    }

}
