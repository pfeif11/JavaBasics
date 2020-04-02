package com.syntax.class21;

public class UserInfo extends UserClass {

	
	String address;
	
	UserInfo(String address,String name, long number) {
		super(name, number);
		this.address=address;
	}
	
	void userDetails() {
		System.out.println(name+" "+number+" "+address);
	}
}
