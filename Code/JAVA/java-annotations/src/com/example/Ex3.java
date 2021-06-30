package com.example;

class Lib {
	@Deprecated
	void m1() {

	}

	void m11() {

	}
}

public class Ex3 {

	public static void main(String[] args) {

		Lib lib = new Lib();
		lib.m1();

	}

}
