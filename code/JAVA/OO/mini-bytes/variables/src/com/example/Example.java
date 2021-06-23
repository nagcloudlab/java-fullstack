package com.example;

class Person {

	static int helloCount = 0; // class/static var  , placed in MethodArea/Mestaspac-memory
	
//	int helloCount = 0; // instance/object var  , placed in Heap-memory
	
	public void sayHello() {
//		int helloCount = 0; // local var , placed in stack-memory
		helloCount++;
		System.out.println("Hello .." + helloCount);
	}

}

public class Example {

	public static void main(String[] args) {

		Person person1 = new Person();
		Person person2 = new Person();

		person1.sayHello();
		person1.sayHello();

		person2.sayHello();

	}

}
