package com.example;

import java.util.Scanner;

public class ArithApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter n1");
		int n1 = scanner.nextInt();

		System.out.println("enter n2");
		int n2 = scanner.nextInt();

		System.out.println("1-Add");

		System.out.println("2-Sub");

		System.out.println("3-Div");
		if (n2 != 0) {
			float result = n1 / n2;
			System.out.println(result);
		} else {
			System.out.println("cant divide..");
		}

		System.out.println("3-Mul");
		System.out.println("All is well");

		scanner.close();

	}

}
