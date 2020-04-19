package com.syntax.review09;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone p1=new Phone("2345678","iPhone");
		p1.price=1200;
		p1.displayInfo();
		p1.setSerialNumber("blah blah blah");
		p1.displayInfo();
	}

}
