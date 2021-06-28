package com.example.single;

import java.util.Scanner;

/*
 * 
 *  s.w => tasks
 *  
 *  task-1 : computation
 *  task-2 : io
 * 
 */

public class App {

	public static void computation() {

		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " started computation...");
		while (true) {

		}
		// System.out.println(threadName+" finished computation...");

	}

	public static void io() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " started io...");
		Scanner scanner = new Scanner(System.in);
		System.out.println("say ur name!");
		String name = scanner.nextLine();
		System.out.println("hello " + name);
		System.out.println(threadName + " finished io...");
	}

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " started..");

		// step-1
		io();

		// step-2:
		// ....
		computation();

	}

}
