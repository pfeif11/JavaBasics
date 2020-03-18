package com.syntax.class07;

public class BooleanWhile {
	
	public static void main(String[] args) {
		boolean rain=true;
		int temp=85;
		if(rain) {
			System.out.println("Take umbrella"); //1 time
		}
		while(rain) {
			System.out.println("Take umbrella"); //1 time
			rain=false; //this stops it
		}
	}

}
