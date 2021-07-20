package com.example.live;

/**
 * 
 * @author naga
 *
 */

public abstract class LivingThing {

	// common behav

	public void eat() {
		System.out.println("LT::eat");
	}

	public final void sleep() {
		System.out.println("LT::sleep");
	}

	public abstract void work();

}
