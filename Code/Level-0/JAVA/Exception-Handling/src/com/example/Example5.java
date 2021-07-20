package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Error vs Exception

class Person {

	int id;
	String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}

public class Example5 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Example5");

		List<Person> list = new ArrayList<Person>();
		for (int i = 0; i < 1000000000; i++) {
			list.add(new Person(i, "person" + i));
			TimeUnit.MICROSECONDS.sleep(10);
		}

	}

}
