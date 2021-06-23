package com.example;

abstract class C1 {
	abstract void m1();

	abstract void m2();
}

abstract class C2 extends C1 {

	void m1() {

	}

}

class C3 extends C2 {
	void m2() {

	}
}

public class Q {
	public static void main(String[] args) {

	}
}
