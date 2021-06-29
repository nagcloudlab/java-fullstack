package com.example;

import java.util.ArrayList;
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

		// nveg --> *

		// TODO

		for (String item : menu) {
			System.out.println(item);
		}

	}

}
