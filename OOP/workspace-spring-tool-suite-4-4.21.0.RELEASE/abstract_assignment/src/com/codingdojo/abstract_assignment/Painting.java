package com.codingdojo.abstract_assignment;

public class Painting extends Art {
	
	public String paintType;
	
	// constructor method
	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType = paintType;
	}

	@Override
	public void viewArt() {
		// TODO Auto-generated method stub
		System.out.printf("title : %s %n author : %s%n description : %s%n paintType : %s%n",
				getTitle(), getAuthor(), getDescription(), paintType);
	}
	
	//getters and setters
	public String getPaintType() {
		return paintType;
	}
	
	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}

}
