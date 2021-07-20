package com.example.multi;

import java.util.Scanner;

public class App {

	public static void computation() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " started computation..." + thread.getState());
		while (true) {

		}
		// System.out.println(threadName+" finished computation...");
	}

	public static void io() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " started io..." + thread.getState());
		Scanner scanner = new Scanner(System.in);
		System.out.println("say ur name!");
		String name = scanner.nextLine();
		System.out.println("hello " + name);
		System.out.println(thread.getName() + " finished io...");
		scanner.close();
	}

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " started execution ..");

		Thread ioThread = new Thread(new Runnable() {
			@Override
			public void run() {
				io();
			}
		},"IO");

		Thread compThread = new Thread(new Runnable() {
			@Override
			public void run() {
				computation();
			}
		},"COMP");

//		System.out.println(ioThread.getState());
//		System.out.println(compThread.getState());

		ioThread.start(); // allocate separate-stack , to execute independently..
		compThread.start(); //

	}

}
