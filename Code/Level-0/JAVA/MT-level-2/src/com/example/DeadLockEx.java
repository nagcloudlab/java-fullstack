package com.example;

class DeadWork implements Runnable {

	private static Object key1 = new Object();
	private static Object key2 = new Object();

	public void m1() {
		synchronized (key1) {
			System.out.println("T1 using key1 in m1-block");
			System.out.println("T1 trying for key2");
			m2();
		}
	}

	public void m2() {
		synchronized (key2) {
			System.out.println("T1 also using key-2 in m2-block");
		}
	}

	public void m3() {
		synchronized (key2) {
			System.out.println("T2 using key2 in m2-block");
			System.out.println("T2 trying for key1");
			m4();
		}

	}

	public void m4() {
		synchronized (key1) {
			System.out.println("T2 also using key-1 in m4-block");
		}
	}

	@Override
	public void run() {

		String tName = Thread.currentThread().getName();

		if (tName.equals("T1")) {
			m1();
		}
		if (tName.equals("T2")) {
			m3();
		}

	}

}

public class DeadLockEx {

	public static void main(String[] args) {

		DeadWork deadWork = new DeadWork();
		Thread thread1 = new Thread(deadWork, "T1");
		Thread thread2 = new Thread(deadWork, "T2");
		thread1.start();
		thread2.start();

	}

}
