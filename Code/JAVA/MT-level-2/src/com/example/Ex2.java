package com.example;

class R1 {
	public synchronized void m1(R2 r2) {
		System.out.println("T1 using R1");
		System.out.println("T1 trying for R2");
		r2.m2();
	}

	public synchronized void m2() {
		System.out.println("T2 also having R1");
	}
}

class R2 {
	public synchronized void m1(R1 r1) {
		System.out.println("T2 using R2");
		System.out.println("T2 trying for R1");
		r1.m2();
	}

	public void m2() {
		System.out.println("T1 also having R2");
	}
}

public class Ex2 {

	public static void main(String[] args) throws InterruptedException {

		R1 r1 = new R1();
		R2 r2 = new R2();

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				r1.m1(r2);
			}
		}, "T1");
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				r2.m1(r1);
			}
		}, "T2");

		thread1.start();
//		TimeUnit.MICROSECONDS.sleep(5);
		thread2.start();

	}

}
