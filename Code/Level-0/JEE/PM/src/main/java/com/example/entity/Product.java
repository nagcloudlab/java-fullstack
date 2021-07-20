package com.example.entity;

public class Product {

	private int id;
	private String name;
	private double price;
	private ProductType type;

	public Product(String name, double price, ProductType type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public Product() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

}
