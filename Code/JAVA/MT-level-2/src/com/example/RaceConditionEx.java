package com.example;

class Counter {
	long count = 0;

	public synchronized void increment() {
		count += 1; // read --> increment --> write
	}

	public long getCount() {
		return count;
	}
}

public class RaceConditionEx {

	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter(); // shared resource

		Runnable counterWork = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					counter.increment();
				}
			}
		};

		Thread[] threads = new Thread[1000];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(counterWork);
			threads[i].start();
		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].join();
		}

		// ----------------------------------------------

		System.out.println(counter.getCount()); // 1000 * 1000 => 1000000

		// ----------------------------------------------

	}

}
