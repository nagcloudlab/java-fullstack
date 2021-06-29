package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {

		List<String> menu = new ArrayList<String>();
		menu.add("veg");
		menu.add("veg");
		menu.add("veg");
		menu.add("nveg");
		menu.add("veg");
		menu.add("nveg");
		menu.add("veg");

//		-----------------------------------------
		// imperative style
//		-----------------------------------------
//		for (int i = 0; i < menu.size(); i++) {
//			String menuItem = menu.get(i);
//			if (menuItem.equals("nveg")) {
//				menu.set(i, "*");
//			}
//		}
//
//		System.out.println(menu);

//		-----------------------------------------
		// declarative style with Lambda-expression / function
//		-----------------------------------------
//		menu.replaceAll(menuItem -> menuItem.equals("nveg") ? "*" : menuItem);
//		System.out.println(menu);

//		-----------------------------------------
//		imperative style
//		-----------------------------------------
//		Iterator<String> iterator = menu.iterator();
//		while (iterator.hasNext()) {
//			String string = (String) iterator.next();
//			if (string.equals("nveg")) {
//				iterator.remove();
//			}
//		}
//		System.out.println(menu);

//		-----------------------------------------
		// declarative style with Lambda-expression / function
//		-----------------------------------------
		menu.removeIf(item -> item.equals("nveg"));
		System.out.println(menu);

	}

}
