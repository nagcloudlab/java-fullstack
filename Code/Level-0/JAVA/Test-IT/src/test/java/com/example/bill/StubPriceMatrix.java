package com.example.bill;

import com.example.pm.PriceMatrix;

public class StubPriceMatrix implements PriceMatrix {

	@Override
	public double getPrice(String itemCode) {
		return 100.00;
	}
	
}
