package com.example.car;

import com.example.wheel.Wheel;
import com.example.wheel.mrf.MRFWheel;

/*
 * 
 *  design & performance issues
 *  -------------------------------------------
 *  
 *  
 *  -> dependent & dependency are tightly-coupled 
 *  	=> can't extend with new features
 *  -> too many duplicate dependency instances created & discarded
 *  	=> consume too much resources & not responsive 
 *  -> Unit-Testing not possible
 *  	=> dev / bug-fix slow
 *  
 *  
 *  why these issues happening here ?
 *  
 *  => dependent creating it's own dependency object 
 *  
 *  solution :
 *  
 *  => don't create dependency object in dependent's home i.e class, 
 *     get from factory  ( factory design pattern )
 *     
 *     
 *  Limitation with Factory-Lookup:
 *  
 *  => factory-location tight-coupling
 *  
 *     
 *   best solution :
 *   
 *   => don't create & lookup dependency object in dependent's home,
 *      inject by third-party
 *             
 *             
 *        Inversion Of Control ( IOC )     
 *        
 *        
 *        how to implement IOC ?
 *        
 *        	=> dependency injection ( DI )
 *        
 *        
 *              ways
 *              
 *              - constructor based DI
 *              - set-method based DI
 *        
 *        		
 *     
 *     
 *  ---------------------------------------------------------------------------------
 *  
 *  
 *  OO principles
 *  
 *  
 *  - Single Responsibility Principle
 *  
 *  	=> “One class should have one and only one responsibility”
 *  
 *  - Open Closed Principle
 *  	
 *      => “Software components should be open for extension, but closed for modification”
 *      
 *  - Liskov’s Substitution Principle
 *  
 *      => “Derived types must be completely substitutable for their base types” 	
 *  
 *  - Interface Segregation Principle
 *  
 *     => “Clients should not be forced to implement unnecessary methods which they will not use”		
 * 
 *  - Dependency Inversion Principle 
 *  
 *     => “Depend on abstractions, not on concretions”
 *     
 *  --------------------------------------------------------------------------------------------
 *  
 *     
 */

// dependent
public class Car {

	private Wheel wheel;

	// constructor level dependency injection
	public Car(Wheel wheel) {
		this.wheel = wheel;
	}

	public void setWheel(Wheel wheel) {
		// validation..........
		this.wheel = wheel;
	}

	public void move() {
//		MRFWheel mrfWheel=new MRFWheel();
		wheel.rotate();
		System.out.println("car moving.....");
	}

}
