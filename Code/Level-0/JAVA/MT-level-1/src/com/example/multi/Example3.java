package com.example.multi;

import java.util.concurrent.TimeUnit;

// join

class StudentWork implements Runnable {
	@Override
	public void run() {

		System.out.println("student learning...");
		System.out.println("student got Q...");

		Thread tnrWork = new Thread(new TrainerWork());
		tnrWork.start();

		try {
			tnrWork.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("student further learning ..");

	}
}

class TrainerWork implements Runnable {
	@Override
	public void run() {
		System.out.println("tnr working on Q");
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("tnr anwering Q");
	}
}

public class Example3 {

	public static void main(String[] args) {

		Thread studThread = new Thread(new StudentWork());
		studThread.start();

	}

}
