package com.example;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Create {

	public static void main(String[] args) {

		Employee employee = new Employee(); // New / Transient
		employee.name = "Nag";
		employee.gender = Gender.FEMALE;
		employee.dob = new Date();


		// Using JPA

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		em.persist(employee); // Managed State

		employee.name="Nagabhushanamn";

		em.getTransaction().commit();
		em.close();
		
	}

}
