package com.example;

import java.util.function.IntPredicate;

public class Ex6 {

	// Higher-Order-Function ==> HOF
	
	/*
	 * 
	 *  by composing many re-usable functions, can build complex function.
	 *  
	 *   i.e HOP 
	 */
	
	public static IntPredicate and(IntPredicate f1, IntPredicate f2) {

		return n -> {
			return f1.test(n) && f2.test(n); // short-circuit operator
		};

	}

	public static void main(String[] args) {

		IntPredicate isMin = n -> n > 10;
		IntPredicate isMax = n -> n < 1000;

//		IntPredicate isMinAndisMax = and(isMin, isMax);
		IntPredicate isMinAndisMax = isMin.and(isMax);
		
		System.out.println(isMinAndisMax.test(500));

	}

}
