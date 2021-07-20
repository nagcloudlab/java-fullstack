package com.example;

/*
 * 
 *  integral => 0
 *  real     => 0.0
 *  boolean  => false
 *  char     => \u0000
 *  
 *  reference => nul
 * 
 * 
 */

class Abc {
	static int staVar;
	int insVar;

	void method() {
		int localVar = 0;
		localVar++;
		System.out.println(localVar);
	}
}

public class Ex1 {

	public static void main(String[] args) {

		System.out.println(Abc.staVar);
		System.out.println(new Abc().insVar);

	}

}
