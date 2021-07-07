package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.example.model.Employee;
import com.example.model.Gender;

public class Ex2 {
	
	public static void main(String[] args) {
		
		Employee[] employees=Employee.SOME;
		
		// build stream i.e pipeline
		List<Employee> femaleEmployess=
		Arrays
		.stream(employees)
		.parallel()
		.filter(emp->emp.getGender().equals(Gender.FEMALE)) // intermediate 
		.collect(Collectors.toList()); // terminal method
		
		
		femaleEmployess
		.forEach(e->System.out.println(e));
		
	}

}
