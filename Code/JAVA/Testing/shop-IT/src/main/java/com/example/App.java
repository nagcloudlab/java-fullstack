package com.example;

import java.util.Arrays;
import java.util.List;

import com.example.bill.Billing;
import com.example.bill.BillingImpl;
import com.example.pm.PriceMatrix;
import com.example.pm.PriceMatrixImpl_v1;

public class App {

	public static void main(String[] args) {

		// inti phase

		PriceMatrix priceMatrix = new PriceMatrixImpl_v1();
		Billing billing = new BillingImpl(priceMatrix);

		// use phase

		List<String> cart = Arrays.asList("123", "456", "789"); // immutable

		double totalPrice = billing.getTotalPrice(cart);
		System.out.println("Total Price: " + totalPrice);

		// destroy phase

	}

}
