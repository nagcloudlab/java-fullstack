package com.example;

import java.util.function.ToIntFunction;

public class Ex10 {

	public static void main(String[] args) {

		ToIntFunction<String> function=s->s.length(); // LE
		// or
		function=String::length; // MR
		
		System.out.println(function.applyAsInt("Nag"));

	}

}
