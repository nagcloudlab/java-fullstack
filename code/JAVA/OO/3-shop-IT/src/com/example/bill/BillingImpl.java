package com.example.bill;

import com.example.pm.PriceMatrix;

public class BillingImpl implements Billing {

	PriceMatrix priceMatrix;

	public BillingImpl(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix;
	}

	public double getTotalPrice(String[] cart) {

		double total = 0.0;

		for (int i = 0; i < cart.length; i++) {
			String itemCode = cart[i];
			double price = priceMatrix.getPrice(itemCode);
			total += price;
		}

		return total;

	}

}
