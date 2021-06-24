package example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListCollnEx2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("F");
		list.add("A");
		list.add("E");

		display(list);

	}

	private static void display(List<String> list) {

//		// index based colln.
//		for (int i = 0; i < list.size(); i++) {
//			String item = list.get(i);
//			System.out.println(item);
//		}

		// way-1
//		Iterator<String> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			String item = iterator.next();
//			System.out.println(item);
//		}

		// or

		for (String item : list) {
			System.out.println(item);
		}

		// way-2
//		ListIterator<String> listIterator = list.listIterator();
//		while(listIterator.hasNext()) {
//			System.out.println(listIterator.next());
//		}
//		System.out.println();
//		while(listIterator.hasPrevious()) {
//			System.out.println(listIterator.previous());
//		}

	}

}
