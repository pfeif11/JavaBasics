package com.syntax.review08;

public class Turkish extends Human {
	
	public Turkish(String name) {
		super(name);
		
	}
	
	public void talk() {
		System.out.println(name+" merhaba diyor");
	}
	
	private void makeBaklava() {
		System.out.println("I am making baklava");
	}

}
