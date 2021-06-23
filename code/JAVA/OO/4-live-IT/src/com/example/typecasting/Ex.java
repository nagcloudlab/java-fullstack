package com.example.typecasting;

/*
 *  types
 *  
 *  
 *  	=> primitive types
 *      => reference types
 *      
 *      	- implicit type-casting
 *          - explicit type-casting
 * 
 * 
 */

class Vehicle {

}

class Car extends Vehicle {
}

class Bike extends Vehicle {
}

public class Ex {

	public static void main(String[] args) {

		Car car = new Car();
		Bike bike = new Bike();

		Vehicle vehicle = bike; // implicit casting

		if (vehicle instanceof Car) {
			Car c = (Car) vehicle; // explicit casting
		}

	}

}
