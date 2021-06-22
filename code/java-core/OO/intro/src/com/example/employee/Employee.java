package com.example.employee;

public class Employee {

	// state
	
	// a. class-state
	public final static String COMP_NAME = "Revature";
	public static String tnrName; // null

	// b. obj-state
	public int id; // 0
	public String name; // null

	// constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// behavior

	// class behav
	public static void teach() {
		System.out.println(tnrName+ " teaching...");
	}

	// obj behv
	public void listen() {
		System.out.println(name + " listening...");
	}

}
