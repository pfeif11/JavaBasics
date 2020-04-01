package com.syntax.repls;

public class Dog {
	  String dogName;
	  double dogWeight;
	  static String dogBreed="Mutt";
	  
	  Dog(String dogName, double dogWeight) {
	   this.dogName=dogName;
	  this.dogWeight=dogWeight; 
	  }
	  
	  void displayDetails() {
	    System.out.println(dogName+" "+dogBreed+" "+dogWeight);
	  }
}
