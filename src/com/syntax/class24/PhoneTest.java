package com.syntax.class24;

public class PhoneTest {
	
	public static void main(String[] args) {
		//new Phone; cannot instantiate/ create an object of Phone class becuase it is abstract
	Phone iphone=new iPhone();
	iphone.call();
	iphone.text();
	iphone.takePicture();
	iphone.playMusic();
	
	Phone samsung=new Samsung();
	samsung.call();
	samsung.text();
	samsung.takePicture();
	samsung.playMusic();
	
	
	
	}

}
