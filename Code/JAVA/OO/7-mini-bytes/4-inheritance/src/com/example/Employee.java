package com.example;

public abstract class Employee {

	private int id;
	public String name;
	public double salary;

	
	
	public Employee(int id) {
		if (id > 0)
			this.id = id;
	}
	
	public int getId() {
		return this.id;
	}

}
