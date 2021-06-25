package example;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import example.model.Book;

public class Ex1 {

	public static void main(String[] args) {

		

		List<Book> books = new LinkedList<Book>();
		
		for (int i = 0; i < 10000000; i++) {
			books.add(new Book(i, "Jane Eyre", "Charlotte Bronte", 14.99));
		}

		Date start = new Date();
		Book book = books.get(4967421);
		System.out.println(book);
		Date end = new Date();
		System.out.println("Elapsed time was " + (end.getTime() - start.getTime()) + " ms.");

	}

}
