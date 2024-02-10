package com.codingdojo.abstract_assignment;

public class Museum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Painting painting = new Painting("Abstract", "Picasso", "Represents abstarct art", "Oil");
		
		Sculpture sculpture = new Sculpture("Vase", "Vinci", "A vase made from oil", "Oil");
		sculpture.viewArt();
		painting.viewArt();

	}

}
