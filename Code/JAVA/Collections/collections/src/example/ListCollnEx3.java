package example;

import java.util.ArrayList;
import java.util.List;

import example.model.Product;

public class ListCollnEx3 {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<Product>();
		products.add(new Product(5235431, "product-1", 5000.00));
		products.add(new Product(2235433, "product-2", 4000.00));
		products.add(new Product(3235435, "product-5", 1000.00));
		products.add(new Product(4235434, "product-3", 3000.00));
		products.add(new Product(1235447, "product-4", 2000.00));
		products.add(new Product(1235447, "product-4", 2000.00));

		display(products);

	}

	private static void display(List<Product> products) {
		for (Product product : products) {
			System.out.println(product.toString());
		}
	}

}
