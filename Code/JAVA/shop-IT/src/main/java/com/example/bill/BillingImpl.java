package com.example.bill;

import java.util.List;

import com.example.pm.PriceMatrix;

public class BillingImpl implements Billing {

	private PriceMatrix priceMatrix;

	public BillingImpl(PriceMatrix priceMatrix) {
		super();
		this.priceMatrix = priceMatrix;
	}

//	public void setPriceMatrix(PriceMatrix priceMatrix) {
//	this.priceMatrix = priceMatrix;
//}

	@Override
	public double getTotalPrice(List<String> cart) {
		double totalPrice = 0;
		for (String itemCode : cart) {
			totalPrice += priceMatrix.getPrice(itemCode);
		}
		return totalPrice;
	}

}
