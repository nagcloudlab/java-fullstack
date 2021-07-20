package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.example.model.Product;
import com.example.model.ProductType;


// why we need FP ?

/*
 * 
 *  ==> for compact & concise code 
 * 
 */

public class Ex1 {

	public static void main(String[] args) {

		// ----------------------------------------------------------------------------

		List<Product> products = new ArrayList<Product>();
		products.add(new Product(123123, "product-1", 5000, ProductType.ELEC));
		products.add(new Product(323122, "product-2", 4000, ProductType.ELEC));
		products.add(new Product(423123, "product-3", 3000, ProductType.OTHER));
		products.add(new Product(223122, "product-4", 2000, ProductType.ELEC));
		products.add(new Product(623122, "product-5", 1000, ProductType.OTHER));

//     ----------------------------------------------------------------------------

		// #req-1
//		List<Product> elecProducts = getElecProducts(products);
//		for (Product product : elecProducts) {
//			System.out.println(product);
//		}

//    ----------------------------------------------------------------------------

		// #req-2
//		List<Product> twoKAndAboveProducts = getTwoKAndAboveProducts(products);
//		for (Product product : twoKAndAboveProducts) {
//			System.out.println(product);
//		}

//     ----------------------------------------------------------------------------
//		#req-3
//		List<Product> result = getProductsByPrice(products, 3000);
//		for (Product product : result) {
//			System.out.println(product);
//		}

//		----------------------------------------------------------------------------

		// 1. Local Inner class

//		class EleProducts implements Predicate {
//			@Override
//			public boolean test(Product product) {
//				return product.getType().equals(ProductType.ELEC);
//			}
//		}
//
//		List<Product> elecProducts = filter(products, new EleProducts());
//		for (Product product : elecProducts) {
//			System.out.println(product);
//		}

//		----------------------------------------------------------------------------

		// 2. Local Anonymous inner class

//		List<Product> twoKAndAboveProducts = filter(products, new Predicate() {
//			@Override
//			public boolean test(Product product) {
//				return product.getPrice() >= 2000;
//			}
//		});
//		for (Product product : twoKAndAboveProducts) {
//			System.out.println(product);
//		}

//		----------------------------------------------------------------------------

		// 3. Lambda Expression

//		Predicate byPrice = (Product product) -> {
//			return product.getPrice() == 2000;
//		};

		// or

//		Predicate byPrice = (product) -> {
//			return product.getPrice() == 2000;
//		};

		// or

//		Predicate byPrice = product -> {
//			return product.getPrice() == 2000;
//		};

		// or

//		Predicate byPrice = product -> product.getPrice() == 2000;

		// or

//		List<Product> result = filter(products, p -> p.getPrice() == 2000);
		List<Product> result = filter(products, p -> p.getType().equals(ProductType.ELEC));
		for (Product product : result) {
			System.out.println(product);
		}

//		----------------------------------------------------------------------------

	}

	/*
	 * -----------------------------------------------------------------------------
	 * 
	 * // declarative style ( intention ( what ) and implementation ( how ) will be
	 * separated
	 * 
	 * -----------------------------------------------------------------------------
	 * 
	 */

	public static List<Product> filter(List<Product> products, Predicate<Product> predicate) {

		List<Product> out = new ArrayList<Product>();
		for (Product product : products) {
			if (predicate.test(product)) {
				out.add(product);
			}
		}
		return out;

	}

	/*
	 * -----------------------------------------------------------------------------
	 * 
	 * // imperative style ( intention ( what ) + implementation ( how ) mixed
	 * together )
	 * 
	 * 
	 * -----------------------------------------------------------------------------
	 * 
	 */

	private static List<Product> getProductsByPrice(List<Product> products, double price) {
		List<Product> out = new ArrayList<Product>();
		for (Product product : products) {
			if (product.getPrice() == price) {
				out.add(product);
			}
		}
		return out;
	}

	private static List<Product> getTwoKAndAboveProducts(List<Product> products) {
		List<Product> out = new ArrayList<Product>();
		for (Product product : products) {
			if (product.getPrice() >= 2000) {
				out.add(product);
			}
		}
		return out;
	}

	private static List<Product> getElecProducts(List<Product> products) {
		List<Product> out = new ArrayList<Product>();
		for (Product product : products) {
			if (product.getType().equals(ProductType.ELEC)) {
				out.add(product);
			}
		}
		return out;
	}

}
