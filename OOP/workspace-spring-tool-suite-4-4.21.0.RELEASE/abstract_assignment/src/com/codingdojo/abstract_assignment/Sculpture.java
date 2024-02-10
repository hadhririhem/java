package com.codingdojo.abstract_assignment;

public class Sculpture extends Art {
	
	public String material;
	
	//constructor method
	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
	}

	@Override
	void viewArt() {
		// TODO Auto-generated method stub
		System.out.printf("Title : %s%n Author : %s%n Description : %s%n Material : %s%n",
				getTitle(), getAuthor(), getDescription(), material);

	}
	// getters and setters
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}

}
