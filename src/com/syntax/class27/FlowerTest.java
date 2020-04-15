package com.syntax.class27;

import java.util.ArrayList;

public class FlowerTest {
	public static void main(String[] args) {
		//flowers into array
		
		
		
		Flower[] flowerArray={new Rose("Rose"), new Tulip("Tulip"), new Sunflower("Sunflower")};
	
		//flowers into arraylist
		
		ArrayList<Flower> flowers=new ArrayList<>();
		flowers.add(new Rose("Rose"));
		flowers.add(new Tulip("Tulip"));
		flowers.add(new Sunflower("Sunflower"));
		//flowers.add("Rose"); cannot add String Object into ArrayList of Flower Objects
	//hw to call available methods using: for loop, advanced for loop, iterator
	//how create a food class that will that 3 undefined methods and will have 4 subclasses;
	//create collection of food (ArrayList) using 3 different ways  to execute methods
	
	
	}

}
