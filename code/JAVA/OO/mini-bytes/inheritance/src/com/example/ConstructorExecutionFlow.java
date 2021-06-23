package com.example;

class A extends Object {
	private int v;

	public A(int arg1) {
		super();
		this.v = arg1;
		System.out.println("im A");
	}

}

class B extends A {
	public B(int arg1) {
		super(arg1);
		System.out.println("im B");
	}
}

class C extends B {
	public C(int arg1) {
		super(arg1);
		System.out.println("im C");
	}
}

public class ConstructorExecutionFlow {

	public static void main(String[] args) {

		C c = new C(123);

	}

}
