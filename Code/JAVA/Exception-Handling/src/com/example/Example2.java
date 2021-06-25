package com.example;

// try-catch

class Employee {
	void work() {

	}
}

public class Example2 {

	public static void main(String[] args) {

		try {

			System.out.println("A");
			int ari = 1 / 1;

			int[] arr = { 12, 13 };
			int n = arr[1];

			Employee employee = null;
			employee.work();

			System.out.println("B");
		} catch (ArithmeticException e) {
			System.out.println("C1");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("C2");
		} catch (Exception e) {
			System.out.println("C3");
		}

		System.out.println("D");

	}

}
