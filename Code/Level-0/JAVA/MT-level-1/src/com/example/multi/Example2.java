package com.example.multi;

import java.util.concurrent.TimeUnit;

// THread sleep

class Work implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Level-" + i + " work");
			try {
//				Thread.sleep(5000);
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Example2 {

	public static void main(String[] args) {

		new Thread(new Work()).start();

	}

}
