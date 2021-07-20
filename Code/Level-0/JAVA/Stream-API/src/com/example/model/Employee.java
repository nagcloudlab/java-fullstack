package com.example.model;

import java.util.Random;
import java.util.stream.Stream;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private Gender gender;

	private Address address;

	public Employee(int id, String name, double salary, Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}

	public Employee(int id, String name, double salary, Gender gender, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", gender=" + gender + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public static boolean isFemale(Employee e) {
		return e.gender.equals(Gender.FEMALE);
	}
	
	public static boolean isMale(Employee e) {
		return e.gender.equals(Gender.MALE);
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}





	public static final Employee[] SOME = {
			new Employee(1,"Mike", 2500,Gender.MALE),
			new Employee(2,"Frank", 3000,Gender.MALE),
			new Employee(3,"Hannah", 2500,Gender.MALE),
			new Employee(4,"Rajeev", 2000,Gender.FEMALE),
			new Employee(5,"Jessica", 1500,Gender.FEMALE),
			new Employee(6,"Doug", 2000,Gender.MALE),
			new Employee(7,"Chen", 3500,Gender.FEMALE),
			new Employee(8,"Krish", 2200,Gender.FEMALE),
			new Employee(9,"Louie", 800,Gender.MALE),
			new Employee(10,"Nag", 800,Gender.MALE),
			new Employee(11,"Nag", 00,Gender.MALE)
		};
	
}
