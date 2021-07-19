package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SaveBoy {

	public static void main(String[] args) {

		// Using JPA

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Boy boy = new Boy();
		boy.id = 11;
		boy.name = "Nag";

		Girl girl = new Girl();
		girl.id = 22;
		girl.name = "Indu";

		boy.girl = girl;

		em.persist(boy);

		em.getTransaction().commit();
		em.close();
	}

}
