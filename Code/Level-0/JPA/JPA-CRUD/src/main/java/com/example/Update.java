package com.example;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class Update {

	public static void main(String[] args) {

		// Using JPA
		
		// #Req-1

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Employee employee = em.find(Employee.class, 2);

		em.getTransaction().commit();
		em.close();
		
		employee.name="Indu"; // detached state
		
		// #Req-2

		em = emf.createEntityManager();
		em.getTransaction().begin();

		em.merge(employee); // managed State

		em.getTransaction().commit();
		em.close();
		
	}

}
