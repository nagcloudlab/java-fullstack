package example.model;

public class Book {
	
	private int id;
	private String title;
	private String author;
	private Double price;

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Book(int id, String title, String author, Double price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String toString() {
		return title + " by " + author;
	}

	public Double getPrice() {
		return this.price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
