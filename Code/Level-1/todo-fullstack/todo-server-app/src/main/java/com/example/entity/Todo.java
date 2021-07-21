package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TODOS",schema = "TODOS_DB")
public class Todo {

	@Id
	@GeneratedValue
	private int id;
	private String title;
	private boolean completed;

	public Todo(String title, boolean completed) {
		super();
		this.title = title;
		this.completed = completed;
	}

	public Todo(String title) {
		super();
		this.title = title;
	}

	public Todo() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", completed=" + completed + "]";
	}

}
