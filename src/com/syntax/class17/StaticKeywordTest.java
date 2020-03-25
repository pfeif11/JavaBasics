package com.syntax.class17;

public class StaticKeywordTest {
	public static void main(String[] args) {
		//access static members of another class
		StaticKeyword.brand="Android";
		StaticKeyword.touchScreen=true;
		StaticKeyword.displayGeneralInfo();
		
		//access instance members of another class
		StaticKeyword sk=new StaticKeyword();
		sk.color="red";
		sk.memory=128;
		sk.displaySpecs();
	}
	
	

}
