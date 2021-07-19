package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SaveGirl {

	public static void main(String[] args) {

		// Using JPA

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Girl girl=new Girl();
		girl.id=22;
		girl.name="Indu";
		
		em.persist(girl);

		em.getTransaction().commit();
		em.close();
	}

}
