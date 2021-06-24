package example;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import example.model.Product;

public class SetCollnEx1 {

	public static void main(String[] args) {

		Set<Product> products = new TreeSet<Product>(new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		products.add(new Product(5235431, "product-1", 5000.00));
		products.add(new Product(2235433, "product-2", 4000.00));
		products.add(new Product(3235435, "product-5", 1000.00));
		products.add(new Product(4235434, "product-3", 3000.00));
		products.add(new Product(1235447, "product-4", 2000.00));
		products.add(new Product(1235447, "product-4", 7000.00));
		products.add(null);

		display(products);

	}

	private static void display(Set<Product> products) {
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
