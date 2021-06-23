package com.example;

import com.example.emp.Employee;

public class App {

	public static void main(String[] args) {

//		Employee employee=new Employee();
		Employee e1 = new Employee(123);
		Employee e2 = new Employee(124, "Nag");
		Employee e3 = new Employee(125, "Nag", 20000);

		//e1.id=123;

		e1.setName("Riya");
		e1.setSalary(1000.00);
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		
		

	}

}
