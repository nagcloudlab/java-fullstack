package com.example.live;

/**
 * 
 * @author team-1
 *
 */

public abstract class Human extends LivingThing {

	public void study() {
		System.out.println("Human::study");
	}

	/*
	 * 
	 * override
	 * 
	 * =>re-implementing base-class's behav with different logic
	 * 
	 * 
	 * coding rules:
	 * 
	 * Must be same :
	 * 
	 * => method name, => type | number | order arguments => return-type
	 * 
	 * May different :
	 * 
	 * => access specifier , but should not reduce visibility
	 * 
	 */

//	public void work() {
//		System.out.println("Human::work");
//	}

}
