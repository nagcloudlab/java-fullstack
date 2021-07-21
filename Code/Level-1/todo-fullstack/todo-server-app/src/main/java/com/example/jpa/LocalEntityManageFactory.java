package com.example.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LocalEntityManageFactory {

	private static EntityManagerFactory emf;

	static {
		emf = Persistence.createEntityManagerFactory("my-pu");
	}

	public static EntityManagerFactory emf() {
		return emf;
	}

}
