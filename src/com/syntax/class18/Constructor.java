package com.syntax.class18;

public class Constructor {

	//static Constructor() {  --> CE:saying invalid modifier
//}
	
	
	
	public Constructor() {
		System.out.println("Public constructor");
	}
	
	protected Constructor(int num,int num2) {
		System.out.println("protected constructor");
	}
}
