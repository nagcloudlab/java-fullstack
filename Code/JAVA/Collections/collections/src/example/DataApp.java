package example;

import example.util.LinkedList;

public class DataApp {
	
	public static void main(String[] args) {
		
		
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("chiken-biryani");
		linkedList.add("veg-biryani");
		
		String favItem=linkedList.get(0);
		System.out.println(favItem);
		
		
	}

}
