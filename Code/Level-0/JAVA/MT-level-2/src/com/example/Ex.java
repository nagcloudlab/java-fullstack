package com.example;

//way-1
class MyThread extends Thread {
	@Override
	public void run() {
		// ..
	}
}

//way-2
class W implements Runnable {
	@Override
	public void run() {
		// ........
	}
}

public class Ex {

	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		myThread.start();

		
		Thread thread = new Thread(new W());
		thread.start();

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// ...
			}
		});

		Thread thread3 = new Thread(() -> {
			// ...
		});

	}

}
