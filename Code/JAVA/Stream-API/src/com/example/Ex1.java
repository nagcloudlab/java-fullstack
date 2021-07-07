package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Employee;
import com.example.model.Gender;

public class Ex1 {

	public static void main(String[] args) {

		Employee[] employees = Employee.SOME;

		List<Employee> femaleEmployess = new ArrayList<>();
		
		for (Employee employee : employees) {
			if (employee.getGender().equals(Gender.FEMALE)) {
				femaleEmployess.add(employee);
			}
		}
		
		for (Employee e : femaleEmployess) {
			System.out.println(e);
		}
	}

}


/*


 issues with above code
 
 => imperative style
 => Sequential  ( single-thread-process )
 => mutable variables leads to race-condition issue in parallel envi
 

  why issues ?
  
   -> External iteration
   
  
   Solution:
   
   -> Internal iteration with declarative function(s) / Lambda Expression : Stream Api	


*/