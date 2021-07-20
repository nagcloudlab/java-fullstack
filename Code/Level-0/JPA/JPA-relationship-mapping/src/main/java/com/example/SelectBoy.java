package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SelectBoy {

	public static void main(String[] args) {

		// Using JPA

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Boy boy = em.find(Boy.class, 11); // select * from boy where id=11

		System.out.println(boy.name);
		System.out.println(boy.girl.name);
		
		
		em.getTransaction().commit();
		em.close();
	}

}
