package com.example.multi;

class SomeWork implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority() + " => in");
	}
}

public class Example4 {

	public static void main(String[] args) {

		SomeWork someWork = new SomeWork();

		Thread thread1 = new Thread(someWork, "T1");
		Thread thread2 = new Thread(someWork, "T2");
		Thread thread3 = new Thread(someWork, "T3");

		thread1.setPriority(Thread.MIN_PRIORITY);
		thread3.setPriority(Thread.MAX_PRIORITY);

		thread1.start();
		thread2.start();
		thread3.start();

	}

}
