package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex5 {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 2, 1, 6, 7, 4, 3, 4, 5, 6, 7, 8, 9);

		Stream<Integer> stream = integers.stream();
		Stream<Integer> stream2 = stream.filter(n -> n % 2 != 0);

		Stream<Integer> stream3 = stream2.limit(3);
		stream3.forEach(System.out::println);

//		stream3.forEach(System.out::println); // error , because closed

	}

}
