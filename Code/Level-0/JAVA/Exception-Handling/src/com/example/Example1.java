package com.example;

public class Example1 {

	public static void main(String[] args) {

		try {

			int v = 10;
			if (v < 100)
				throw new IllegalStateException("the value must be > 100");
			
			// 

		} catch (IllegalStateException e) {
			// Handling code...
			/*
			 * 
			 * -> report to end-user with friendly message
			 * -> log exception for future fix
			 * -> release any external resource ( file , db-connection )
			 * -> re-throw the exception , dependent module may handle further
			 * 
			 */
			System.err.println("Ex: "+e.getMessage());
		}

		System.out.println(".....");

	}

}
