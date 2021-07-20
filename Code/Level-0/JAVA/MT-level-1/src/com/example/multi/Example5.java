package com.example.multi;

class LongWork implements Runnable {
	@Override
	public void run() {

		String tName = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			if(i==5) {
				Thread.yield();
			}
			System.out.println(tName + " - " + i);
		}

	}
}

public class Example5 {

	public static void main(String[] args) {

		LongWork longWork = new LongWork();

		Thread thread1 = new Thread(longWork, "T1");
		Thread thread2 = new Thread(longWork, "T2");

		thread1.start();
		thread2.start();

	}

}
