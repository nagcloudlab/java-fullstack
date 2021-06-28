package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example8 {
	
	public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException {
		
		FileInputStream fis=new FileInputStream("./products.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		Product product=(Product)obj;
		System.out.println(product);
		
		
		
		
	}

}
