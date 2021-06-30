package com.example;

// You
public class TestCase {

	@Test
	public void tm1() {
		System.out.println("Tm1");
	}

	@Test(ignore = false)
	public void tm2() {
		System.out.println("Tm2");
	}

	public void om() {
		System.out.println("Om");
	}

}
