package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Ex3 {

	public static void main(String[] args) {

		// How to create streams ?

		// finite stream

//		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
//		.forEach(System.out::println);

		//
//		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		Arrays.stream(numbers).forEach(System.out::println);

//		List<Integer> numbers = new ArrayList<>();
//		numbers.add(1);
//		numbers.add(2);
//		numbers.add(3);
//		numbers.add(4);
//		numbers.add(5);
//
//		numbers.stream().forEach(System.out::println);

		// infinite stream

//		Random random = new Random();
//
//		Stream.generate(() -> {
//			return random.nextInt();
//		}).forEach(System.out::println);

//		Stream.iterate(0, i -> i + 1).forEach(System.out::println);

	}

}
