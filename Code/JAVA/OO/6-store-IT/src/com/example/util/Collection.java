package com.example.util;

public interface Collection {
	void add(String e);

	void sort();

	void clear();

	// java 1.8

	default void forEach() {
		// .....
	}

	static void staMethod() {
		// ...
	}

}
