package example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import example.util.LinkedList;

public class ListCollnEx {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("A");

//		System.out.println(list);
//		System.out.println(list.get(0));

		display(list);

		Set<String> set = new TreeSet<String>();
		set.add("A");
		set.add("C");
		set.add("B");

		display(set);

		// this is my custom Linked List, not built-in
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("A");
		linkedList.add("C");
		linkedList.add("B");

		display(linkedList);

	}

	private static void display(Iterable<String> colln) {

		// way-1
//		for (int i = 0; i < colln.size(); i++) {
//			String item = colln.get(i);
//			System.out.println(item);
//		}

		// Iterator design pattern
//		Iterator<String> iterator = colln.iterator();
//		while (iterator.hasNext()) {
//			String nextEle = iterator.next();
//			System.out.println(nextEle);
//		}

		// JDK 1.5 : for-each loop
		for (String item : colln) {
			System.out.println(item);
		}

		int[] numbers = new int[10];
		for (int n : numbers) {
			System.out.println(n);
		}

	}

}
