package com.example.emp;

public class Employee {

	private int id;
	private String name;
	private double salary;
	
//	public Employee() {
//		this(0,"Nil",0);
//	}

	public Employee(int id) {
//		if (id > 0)
//			this.id = id;
		this(id, null, 0.0);
	}

	public Employee(int id, String name) {
//		if (id > 0)
//			this.id = id;
//		if (name != null)
//			this.name = name;
		this(id, name, 0.0);
	}

	public Employee(int id, String name, double salary) {
		if (id > 0)
			this.id = id;
		if (name != null)
			this.name = name;
		if (salary > 0 && salary < 10000.00)
			this.salary = salary;
	}

	public int getId() {
		return this.id;
	}

	public void setName(String name) {
		if (name != null)
			this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0 && salary < 10000.00)
			this.salary = salary;
	}

}
