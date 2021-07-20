package com.example;

import java.io.Externalizable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Serialization

/*
 * 
 *  by converting passive java-objects into binary-format, 
 *  then store in file-system or transfer over n/w & re-store when required
 *  
 *  
 *  why we need?
 *  
 *  
 *  	=> to keep passive away from heap
 *      => to distribute java-object over n/w to other application
 *      => on restart, to restore session objects
 *  
 *  
 *  transient
 *  
 *  	=> to exclude any property from serialization
 *  
 *  		e.g password | external-resource objects fields
 *   
 * 
 */

// 
class Product implements Externalizable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 112345678923456783L;

	private int id;
	private String name;
	private transient double price;
	private String newProp;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeChars("by Nag");
		out.flush();
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println(in.readLine());
	}

}

public class Example7 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Product product = new Product(123, "Product-1", 1000.00); // Heap

		FileOutputStream fos = new FileOutputStream("./products.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(product);
		oos.close();
		System.out.println("product obj serialized..");

	}

}
