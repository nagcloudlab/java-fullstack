package com.example;

import java.util.Arrays;

import com.example.model.Employee;
import com.example.model.Gender;

public class Ex6 {

	public static void main(String[] args) {

		

		Employee[] employees=Employee.SOME;
		
		
//		Arrays.stream(employees)
//		.filter(emp->emp.getGender().equals(Gender.FEMALE))  
//		.forEach(e->System.out.println(e));
		
		
		// or
		
		Arrays.stream(employees)
		//.filter(Employee::isFemale)  
		//.limit(2)
		//.distinct()
		//.takeWhile(Employee::isMale)
		.forEach(System.out::println);
		
		
		

	}

}
