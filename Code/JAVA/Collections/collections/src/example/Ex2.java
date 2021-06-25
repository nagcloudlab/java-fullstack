package example;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import example.model.Book;

public class Ex2 {

	public static void main(String[] args) {

		Date start = new Date();
		
		Map<Integer, Book> books = new HashMap<>(500000);
		
		for (Integer i = 0; i < 10000000; i++) {
			books.put(i, new Book(i, "Jane Eyre", "Charlotte Bronte", 14.99));
		}

		Date end = new Date();
		
		System.out.println("Elapsed time was " + (end.getTime() - start.getTime()) + " ms.");

	}

}
