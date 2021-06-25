package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// standard input/output sources

public class Example1 {

	public static void main(String[] args) {

//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
//
//		System.out.println("say ur name ?");
//
//		try {
//			String name = br.readLine();
//			System.out.println(name);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

		// ------------------------------------------------------

		Scanner scanner = new Scanner(System.in);
		System.out.println("name?");
		String name = scanner.nextLine();
		System.out.println("age?");
		int age = scanner.nextInt();
		scanner.close();

		// ------------------------------------------------------

		char[] ca = { 'A', 'B' };
		String s = new String(ca);

	}

}
