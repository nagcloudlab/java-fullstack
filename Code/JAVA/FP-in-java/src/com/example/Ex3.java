package com.example;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntToDoubleFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Ex3 {

	public static void main(String[] args) {

		Predicate<String> predicate = str -> str.isEmpty();
		Predicate<String> predicate2=new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		Consumer<String> consumer = str -> System.out.println(str);
		Supplier<String> supplier = () -> "hello";
		Function<String, String> function = str -> str.toUpperCase();

		BiPredicate<String, Integer> biPredicate = (str, i) -> str.length() > i;
		BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(s1 + "s2");
		BiFunction<Integer, Integer, Integer> biFunction = (n1, n2) -> n1 + n2;

		UnaryOperator<String> unaryOperator = s -> s;
		BinaryOperator<Integer> binaryOperator = (n1, n2) -> n1 + n2;

//		System.out.println(binaryOperator.apply(12, 13));

		IntBinaryOperator intBinaryOperator = (n1, n2) -> n1 + n2;

		IntToDoubleFunction intToDoubleFunction = i -> 1.0;

		ToIntFunction<String> toIntFunction = str -> str.length();

	}

}
