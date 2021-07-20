package com.example;

import java.util.concurrent.CopyOnWriteArrayList;

import com.example.util.LinkedList;
import com.example.util.List;

public class StoreApp {

	public static void main(String[] args) {

		List list = new LinkedList();
		list.add("Nag");
		list.add("Riya");
		list.add("Diya");
		list.add(1, "Indu");
		

	}

}
