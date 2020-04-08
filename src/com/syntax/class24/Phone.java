package com.syntax.class24;

abstract public class Phone {
	
	public void call() {
		System.out.println("Phone call make a call");
	}

	public void text() {
		System.out.println("Phone can send text");
	}
	//unimplemented methods=undefined methods=abstract methods
	public abstract void takePicture();
	
	public abstract void playMusic();
}

 class iPhone extends Phone {

	@Override
	public void takePicture() {
		
		System.out.println("iPhone takes pictures");
	}

	@Override
	public void playMusic() {
		System.out.println("iPhones play music using Apple Store");
		
	}
	
}
 
 class Samsung extends Phone {

	@Override
	public void takePicture() {
		System.out.println("Samsung takes pictures");
		
	}

	@Override
	public void playMusic() {
		System.out.println("Samsung plays music using google store");
		
	}
	 
 }
