package com.example;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {

		Employee employee = new Employee();

		employee.name = "Nag";
		employee.gender = Gender.MALE;

		Address address = new Address();
		address.city = "dubai";
		address.country = "UAE";

		
		Address homeAddress=new Address();
		homeAddress.city="chennai";
		homeAddress.country="india";
		

		employee.addresses=Arrays.asList(address,homeAddress);
		
		
		// Using JPA

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		em.persist(employee);

		em.getTransaction().commit();
		em.close();
	}

}
