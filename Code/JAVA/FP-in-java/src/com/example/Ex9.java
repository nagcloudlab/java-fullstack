package com.example;

import java.util.ArrayList;
import java.util.List;

class FoodUtil {
	public static boolean isNonVeg(String item) {
		return item.equals("non-veg");
	}
}

// Method Reference ( MR )

public class Ex9 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("veg");
		list.add("non-veg");
		list.add("veg");
		list.add("non-veg");

//		list.removeIf(item->item.equals("non-veg"));
//		list.removeIf(item -> FoodUtil.isNonVeg(item));
		list.removeIf(FoodUtil::isNonVeg); // MR

		System.out.println(list);

	}

}
