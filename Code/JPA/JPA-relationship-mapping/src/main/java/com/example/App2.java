package com.example;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App2 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

	
//		Employee employee=new Employee();
//		employee.id=1;
//		employee.name="EMP-1";
//		
//		Project project1=new Project();
//		project1.id=11;
//		project1.name="Project-1";
//		
//		
//		Project project2=new Project();
//		project2.id=22;
//		project2.name="Project-2";
//		
//		employee.projects=Arrays.asList(project1,project2);
//		
//		project1.employees=Arrays.asList(employee);
//		project2.employees=Arrays.asList(employee);
//		
//		em.persist(project1);
//		em.persist(project2);
//		em.persist(employee);
		
		
		
		Employee employee= em.find(Employee.class, 1);
		System.out.println(employee.name);
		
		for(Project project:employee.projects) {
			System.out.println(project.name);
		}
		
		
		
		em.getTransaction().commit();
		em.close();
		
		

	}

}
