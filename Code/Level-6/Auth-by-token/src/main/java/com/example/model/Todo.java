package com.example.model;

public class Todo {
	
	private int id;
	private String name;
	private boolean completed;
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
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public Todo(int id, String name, boolean completed) {
		super();
		this.id = id;
		this.name = name;
		this.completed = completed;
	}
	
	public Todo() {
		// TODO Auto-generated constructor stub
	}

}
