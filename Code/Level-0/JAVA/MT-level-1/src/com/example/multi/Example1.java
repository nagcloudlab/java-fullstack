package com.example.multi;

class Task implements Runnable {

	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		String threadName = thread.getName();
		int priority = thread.getPriority();
		for (int i = 0; i < 500; i++) {
			System.out.println(threadName + "(" + priority + ") -> " + i);
		}
		System.out.println(threadName + " completed task..");
	}
}

public class Example1 {

	public static void main(String[] args) {

		Task task = new Task();

		Thread thread1 = new Thread(task, "T1");
		Thread thread2 = new Thread(task, "T2");
		Thread thread3 = new Thread(task, "T3");
		Thread thread4 = new Thread(task, "T4");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

	}

}
