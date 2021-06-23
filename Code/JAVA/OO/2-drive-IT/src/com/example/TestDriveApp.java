package com.example;

import com.example.car.Car;
import com.example.wheel.Wheel;
import com.example.wheel.ceat.CEATWheel;
import com.example.wheel.mrf.MRFWheel;

public class TestDriveApp {

	public static void main(String[] args) {

//		Wheel mrfWheel = new MRFWheel();
//		Car car1 = new Car(mrfWheel);
//		car1.move(); //

		System.out.println();

		Wheel ceatWheel = new CEATWheel();
		Car car2 = new Car(ceatWheel);
		car2.move();

		// ...
		Wheel mrfWheel = new MRFWheel();
		car2.setWheel(mrfWheel);
		car2.move();

	}

}
