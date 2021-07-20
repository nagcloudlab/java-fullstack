package com.example;

@FunctionalInterface
interface FI {

	void apply(String s);

	default void defaultMethod() {

	}

	static void staicMethod() {

	}

}

public class Ex4 {

	public static void main(String[] args) {

		// -----------------------------------------------
		class C implements FI {
			@Override
			public void apply(String s) {

			}
		}
		FI fi = new C();

		// -----------------------------------------------

		FI fi2 = new FI() {

			@Override
			public void apply(String s) {

			}
		};
		// -----------------------------------------------

		// Explicit typed LE

//		FI fi3=(String s)->{
//			
//		};

		// Implicit Typed LE
//		FI fi3 = (s) -> {
//
//		};

//		FI fi3 = s -> {
//			System.out.println(s);
//		};

		FI fi3 = (s) -> System.out.println(s);

		fi3.defaultMethod();

		FI.staicMethod();

	}

}
