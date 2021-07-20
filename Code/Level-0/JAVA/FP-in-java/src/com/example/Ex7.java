package com.example;

// AC vs LE

public class Ex7 {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("im thread...");
			}
		});
		
		Thread thread2 = new Thread(()->{
			System.out.println("im thread");
		});
		

	}

}
