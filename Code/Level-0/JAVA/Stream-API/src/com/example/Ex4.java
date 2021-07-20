package com.example;

import java.util.Random;
import java.util.stream.Stream;

public class Ex4 {

	public static void main(String[] args) {

		// How stream works ?

		Random random = new Random();

		Stream<Integer> stream = Stream.generate(() -> {
			return random.nextInt();
		}); // build stream

		stream.peek(n -> System.out.println("n -> " + n)) // for debugging
				.filter(n -> n > 0) // intermediate
				.limit(10) // intermediate
				.forEach(System.out::println); // terminal

	}

}
