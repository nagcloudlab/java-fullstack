package com.example.service;

import org.apache.log4j.Logger;

import com.example.repository.Repository;

public class ServiceImpl implements Service {

	private static Logger logger = Logger.getLogger("app1");

	private Repository repository;

	public ServiceImpl(Repository repository) {
		this.repository = repository;
		logger.info("Service instance created...");
	}

	public void doXXX(double inp1, String inp2, String inp3) {
		// TODO Auto-generated method stub
		// System.out.println("Service-doXXX invoked");
		logger.info("txr initiated...."); // run on separe thread
		///

		try {

			Object obj1 = repository.findById(inp2);
			Object obj2 = repository.findById(inp3);

			if (System.currentTimeMillis() % 2 == 0) {
				throw new IllegalStateException("oops");
			}

		} catch (IllegalStateException e) {
			logger.error(e.getMessage());
		}

		// System.out.println("Service-doXXX successful");
		logger.info("txr completed...");

	}

}
