package com.example;

import java.util.Arrays;
import java.util.stream.Stream;

import com.example.model.Employee;

public class Ex7 {
	
	public static void main(String[] args) {
	
		
		//------------------------------------------------
		
//		Employee[] employees=Employee.SOME;
//		
//		Arrays.stream(employees)
//		.map(Employee::getName)
//		.map(String::toUpperCase)
//		.map(name->name.charAt(0))
//		.forEach(System.out::println);
		
		//------------------------------------------------
		
		
		// flatMap
		String[] menuLines= {
				"idly,vada,poori",
				"idly,poori",
				"vada-pav,poha",
				"idly"
		};
		
		Arrays
		.stream(menuLines)
		.flatMap(menuLine-> Arrays.stream(menuLine.split(",")))
		.distinct()
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		
//		------------------------------------------------
	}
	

}
