package com.example;

import java.util.concurrent.TimeUnit;

class A {

	private static Object key1 = new Object();

	public void m1() {
		synchronized (key1) {
			String tName = Thread.currentThread().getName();
			System.out.println(tName + " using A:m1()");
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(tName + " finished A:m1()");
		}
	}

	public void m2() {
		synchronized (key1) {
			String tName = Thread.currentThread().getName();
			System.out.println(tName + " using A:m2()");
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(tName + " finished A:m2()");
		}
	}

}

public class Ex1 {

	public static void main(String[] args) {

		A a1 = new A(); // marry
		A a2 = new A(); // john

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				a1.m1();
			}
		}, "T1");

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				a2.m2();
			}
		}, "T2");

		t1.start();
		t2.start();

	}

}
