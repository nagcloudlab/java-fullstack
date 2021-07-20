package com.example.live;

/**
 * 
 * @author team-3
 *
 */

public class Robot extends LivingThing {

	public void eat() {
		System.out.println("Robot::eat");
	}

	@Override
	public void work() {
		System.out.println("Robot::work");
	}

}
