package com.example;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.CollectionTable;
//import javax.persistence.ElementCollection;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

@Document
//@Entity
//@Table(name = "FOOD")
public class Food {

	@Id
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double price;
//	@Temporal(TemporalType.TIMESTAMP)
	private Date makeDate;
//	@Temporal(TemporalType.TIMESTAMP)
	private Date expDate;
//	@Enumerated(EnumType.STRING)
	private FoodType type;
//	@ElementCollection(fetch = FetchType.EAGER)
//	@CollectionTable(name="FOOD_TAGS")
	private List<String> tags;

	public Food() {
	}

	public Food(int id,String name, double price, Date makeDate, Date expDate, FoodType type, List<String> tags) {
		super();
		this.id=id;
		this.name = name;
		this.price = price;
		this.makeDate = makeDate;
		this.expDate = expDate;
		this.type = type;
		this.tags = tags;
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

	public Date getMakeDate() {
		return makeDate;
	}

	public void setMakeDate(Date makeDate) {
		this.makeDate = makeDate;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public FoodType getType() {
		return type;
	}

	public void setType(FoodType type) {
		this.type = type;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", price=" + price + ", makeDate=" + makeDate + ", expDate="
				+ expDate + ", type=" + type + ", tags=" + tags + "]";
	}

}
