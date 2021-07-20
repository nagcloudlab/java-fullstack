package com.example.repository;

import org.apache.log4j.Logger;

public class RepositoryImpl implements Repository {

	private static Logger logger = Logger.getLogger("app1");

	public RepositoryImpl() {
		logger.info("Repository instance created..");
	}

	public Object findById(String id) {
		// System.out.println("Repository-findById - " + id);
		logger.info("finding " + id);
		return null;
	}

}
