package com.codingdojo.abstract_assignment;

public abstract class Art {
	
	//member variables
	public String title;
	public String author;
	public String description;
	
	// constructor method
	public Art(String title, String author, String description) {
		this.title = title;
		this.author = author;
		this.description = description;
	}
	
	// abstract method
	abstract void viewArt();
	
	//getters and setters
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	public String getDescription() {
		return description;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
