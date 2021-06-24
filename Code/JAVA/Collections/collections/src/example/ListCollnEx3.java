package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import example.model.Product;

class NameComparator implements Comparator<Product> {
	@Override
	public int compare(Product o1, Product o2) {
		String o1Name = o1.getName();
		String o2Name = o2.getName();
		return o1Name.compareTo(o2Name);
	}
}

public class ListCollnEx3 {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<Product>();
		products.add(new Product(5235431, "product-1", 5000.00));
		products.add(new Product(2235433, "product-2", 4000.00));
		products.add(new Product(3235435, "product-5", 1000.00));
		products.add(new Product(4235434, "product-3", 3000.00));
		products.add(new Product(1235447, "product-4", 2000.00));
		products.add(new Product(1235447, "product-4", 2000.00));

//		display(products);

//		Collections.sort(products);
//		display(products);

		//

//		Collections.sort(products, new NameComparator());
//		display(products);

		// Local Inner Class
//		class PriceComparator implements Comparator<Product> {
//			@Override
//			public int compare(Product o1, Product o2) {
//				return Double.compare(o1.getPrice(), o2.getPrice());
//			}
//		}
//		Collections.sort(products, new PriceComparator());
//		display(products);

		// or

		// Local Anonymous Inner Class
//		Comparator<Product> priceComparator = new Comparator<Product>() {
//			@Override
//			public int compare(Product o1, Product o2) {
//				return Double.compare(o1.getPrice(), o2.getPrice());
//			}
//		};
//		Collections.sort(products, priceComparator);
//		display(products);

		// Or
		
		// java 1.8 : Lambda Expression / FUnction
		Collections.sort(products, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));

	}

	private static void display(List<Product> products) {
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
