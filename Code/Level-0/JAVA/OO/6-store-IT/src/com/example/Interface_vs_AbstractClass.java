package com.example;

interface I {
	public static final int VAR = 100; // constant variable
	// No constructor

	public abstract void am();
	default void dm() {
		
	}
}

abstract class AC {
	int var;

	public AC() {
	}

	abstract void am();

	void nm() {
		// ..
	}
}



public class Interface_vs_AbstractClass {

	public static void main(String[] args) {

//		I i=new I();
//		AC ac=new AC();

	}

}
