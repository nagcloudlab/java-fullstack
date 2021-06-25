package example;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCollnEx1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(4, "Diya");
		map.put(2, "Indu");
		map.put(3, "Riya");
		map.put(1, "Nag");
		map.put(1, "Nag");

//		System.out.println(map.size());
//
//		String thirdPerson = map.get(3);
//		System.out.println(thirdPerson);

		// -----------------------------------------------------------

		for (Integer key : map.keySet()) {
			System.out.println(map.get(key));
		}

//		-------------------------------------------------------------

		/*
		 * 
		 * TreeMap
		 * 
		 * key - comparable object & unique
		 * 
		 * 
		 * TreeSet
		 * 
		 * 
		 * 
		 */

	}

}
