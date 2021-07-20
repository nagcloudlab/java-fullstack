package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Department department = new Department();
		department.id = 1;
		department.depName = "IT";

//		em.persist(department);

		Employee employee1 = new Employee();
		employee1.id = 11;
		employee1.name = "EMP-1";
		employee1.department = department;

		Employee employee2 = new Employee();
		employee2.id = 22;
		employee2.name = "EMP-2";
		employee2.department = department;

//		em.persist(employee1);
//		em.persist(employee2);

		List<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);

		department.employees = employees;

//		em.persist(department);

//		em.remove(em.find(Department.class, 1));

//		Department dep = em.find(Department.class, 1);
//		System.out.println(dep.depName);
//		
//		for(Employee employee:dep.employees) {
//			System.out.println(employee.name);
//		}
		
		Employee employee=em.find(Employee.class, 11);
		System.out.println(employee.name);
		System.out.println(employee.department.depName);
		
		em.getTransaction().commit();
		em.close();
		
		

	}

}
