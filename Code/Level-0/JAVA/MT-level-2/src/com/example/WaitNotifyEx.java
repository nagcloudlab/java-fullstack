package com.example;

import java.util.concurrent.TimeUnit;

public class WaitNotifyEx {

	private static Object lock = new Object();

	private static int[] buffer;
	private static int count;

	static class Producer {
		public void produce() {

			synchronized (lock) {
				if (isFull()) {
					try {
						System.out.println("producer waiting isFull=true");
						lock.wait();
						System.out.println("producer got notified..");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("produced an item into buffer");
				buffer[count++] = 1;
				lock.notifyAll();
			}

		}
	}

	static class Consumer {
		public void consume() {

			synchronized (lock) {
				if (isEmpty()) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				try {
					TimeUnit.SECONDS.sleep(3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				buffer[--count] = 0;
				System.out.println("consumed an item");
				lock.notifyAll();
			}

		}
	}

	private static boolean isEmpty() {
		return count == 0;
	}

	private static boolean isFull() {
		return count == buffer.length;
	}

	public static void main(String[] args) throws InterruptedException {

		buffer = new int[10];
		count = 0;

		Producer producer = new Producer();
		Consumer consumer = new Consumer();

		Runnable consumeTask = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					producer.produce();
				}
				System.out.println("done producing");
			}
		};
		Runnable produceTask = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 45; i++) {
					consumer.consume();
				}
				System.out.println("done consuming");
			}
		};

		Thread consumerThread = new Thread(consumeTask);
		Thread producerThread = new Thread(produceTask);

		consumerThread.start();
		producerThread.start();

		producerThread.join();
		consumerThread.join();

		System.out.println("data in the buffer : " + count);

	}

}
