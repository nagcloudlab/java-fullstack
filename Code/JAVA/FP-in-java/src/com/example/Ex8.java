package com.example;

import java.util.function.Consumer;

class Xyz {
	static int staVar = 0;
	int insVar = 1;

	public Consumer<String> getLambda() {

		String message = "Hello";

		Consumer<String> consumer = name -> {
			System.out.println(staVar);
			System.out.println(insVar);
			System.out.println(message + "->" + name);
		};

//		message="hi";

		return consumer;

	}

}

// Var usage in LE

public class Ex8 {

	public static void main(String[] args) {

		Xyz xyz = new Xyz();
		Consumer<String> consumer = xyz.getLambda();
		consumer.accept("Nag");

	}

}
