package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.example.model.Product;
import com.example.model.ProductType;

public class Ex5 {

	public static void main(String[] args) {

		// ----------------------------------------------------------------------------

		List<Product> products = new ArrayList<Product>();
		products.add(new Product(123123, "product-1", 5000, ProductType.ELEC));
		products.add(new Product(323122, "product-2", 4000, ProductType.ELEC));
		products.add(new Product(423123, "product-4", 6000, ProductType.OTHER));
		products.add(new Product(223122, "product-3", 6000, ProductType.ELEC));
		products.add(new Product(623122, "product-5", 1000, ProductType.OTHER));
		products.add(null);

//		     ----------------------------------------------------------------------------

		Comparator<Product> byName = (o1, o2) -> o1.getName().compareTo(o2.getName());
		Comparator<Product> byPrice = (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice());

//		Comparator<Product> byPriceDesc = byPrice.reversed();

//		Comparator<Product> byPriceAndByName = (o1, o2) -> {
//
//			if (o1.getPrice() == o2.getPrice()) {
//				return o1.getName().compareTo(o2.getName());
//			} else if (o1.getPrice() > o2.getPrice()) {
//				return 1;
//			} else {
//				return -1;
//			}
//
//		};

		Comparator<Product> byPriceAndByName = Comparator.nullsLast(byPrice.thenComparing(byName));

		Collections.sort(products, byPriceAndByName);

		for (Product product : products) {
			System.out.println(product);
		}

	}

}
