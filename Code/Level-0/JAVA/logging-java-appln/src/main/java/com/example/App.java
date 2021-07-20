package com.example;

import com.example.repository.Repository;
import com.example.repository.RepositoryImpl;
import com.example.service.Service;
import com.example.service.ServiceImpl;

public class App {

	public static void main(String[] args) {

		Repository repository = new RepositoryImpl();
		Service service = new ServiceImpl(repository);

		service.doXXX(100.00, "1", "2");

	}

}
