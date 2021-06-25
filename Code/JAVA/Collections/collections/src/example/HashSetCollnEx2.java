package example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import example.model.Product;

public class HashSetCollnEx2 {

	public static void main(String[] args) {

//		Set<Product> products = new HashSet<Product>();
		Set<Product> products = new LinkedHashSet<Product>();
		products.add(new Product(5235431, "product-1", 5000.00));
		products.add(new Product(2235433, "product-2", 4000.00));
		products.add(new Product(3235435, "product-5", 1000.00));
		products.add(new Product(4235434, "product-3", 3000.00));
		products.add(null);
		products.add(null);
		
		Product product41=new Product(1235447, "product-4", 2000.00);
		Product product42=new Product(1235447, "product-4", 2000.00);
		
		System.out.println(product41.hashCode());
		System.out.println(product42.hashCode());
		
		System.out.println(product41.equals(product42));
		
		products.add(product41);
		products.add(product42);

		display(products);

	}

	private static void display(Set<Product> products) {

		for (Product product : products) {
			System.out.println(product);
		}

	}

}
