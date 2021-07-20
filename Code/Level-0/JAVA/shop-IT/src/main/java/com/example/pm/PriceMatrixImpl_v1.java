package com.example.pm;

import java.util.HashMap;
import java.util.Map;

import com.example.exception.ItemNotFoundException;

public class PriceMatrixImpl_v1 implements PriceMatrix {

	private Map<String, Double> inMemoryDatabase = new HashMap<String, Double>();

	public PriceMatrixImpl_v1() {

		inMemoryDatabase.put("123", 100.00);
		inMemoryDatabase.put("456", 200.00);
		inMemoryDatabase.put("789", 300.00);

	}

	@Override
	public double getPrice(String itemCode) {
		//
		Double price = inMemoryDatabase.get(itemCode);
		if (price == null)
			throw new ItemNotFoundException("not found");

		return price;
	}

}
