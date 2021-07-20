package com.example;

class Super {
	void abc() {
		System.out.println("super:abc()");
	}
}

class Sub extends Super {

	@Override
	void abc() {
		System.out.println("sub:abc()");
	}

}

public class Ex1 {

	public static void main(String[] args) {

		Sub sub = new Sub();
		sub.abc();

	}

}
