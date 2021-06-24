package example;

/*
 * 
 *  string
 *  	=> group of characters
 *  
 *  Notes :
 *  	in java ,
 *  		=> every string is an object
 *  		
 *  
 *  How to manage strings?
 *  	- String
 *  	- StringBuffer
 *  	- StringBuilder
 *  
 * 
 */

public class Example1 {

	public static void main(String[] args) {

		//
		String s1 = new String("revature");
		String s2 = new String("revature");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		String s3 = "revature";
		String s4 = "revature";

		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

	}

}
