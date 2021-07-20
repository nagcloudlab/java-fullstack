package com.example;

class Xyz {

	static int staVar = 10;
	int insVar;

	static void staMethod(Xyz xyz) {
		System.out.println(staVar);
		System.out.println(xyz.insVar);
	}

	void insMethod() {
		System.out.println(staVar);
		System.out.println(insVar);
	}
}

public class Ex2 {

	public static void main(String[] args) {

		Xyz xyz = new Xyz();
		xyz.insVar = 100;
		xyz.insMethod();

		Xyz.staMethod(xyz);

	}

}
