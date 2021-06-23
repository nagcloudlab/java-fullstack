package com.example;

import com.example.bill.Billing;
import com.example.bill.BillingImpl;
import com.example.pm.PriceMatrix;
import com.example.pm.PriceMatrix_v1;
import com.example.pm.PriceMatrix_v2;

public class ShopApp {

	public static void main(String[] args) {

		// init
		PriceMatrix priceMatrixV1 = new PriceMatrix_v1();
		PriceMatrix priceMatrixV2 = new PriceMatrix_v2();

		Billing billing = new BillingImpl(priceMatrixV1);

		// use

		String[] cart = { "123", "456", "789" };
		double totalPrice = billing.getTotalPrice(cart);
		System.out.println("Total " + totalPrice);

		System.out.println("happy shopping..");

		// destroy

	}

}
