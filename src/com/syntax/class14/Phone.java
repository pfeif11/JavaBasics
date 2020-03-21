package com.syntax.class14;

public class Phone {
	
	String make;
	String color;
	int memoryGigs;
	
	void call() {
		System.out.println(make+" can make phone calls");
	}
	void internet() {
		System.out.println(make+" can surf on the internet");
	}
	void photos() {
		System.out.println(make+" can take photos");
	}
	
	
	
	
	public static void main(String[] args) {
		Phone phone1=new Phone();
		
		phone1.make="iPhone";
		phone1.color="White";
		phone1.memoryGigs=16;
		
		phone1.call();
		phone1.internet();
		phone1.photos();
		
		Phone phone2=new Phone();
		phone2.make="Android";
		phone2.color="Blue";
		phone2.memoryGigs=32;
		
		phone2.call();
		phone2.internet();
		phone2.photos();
		
		
		Phone phone3=new Phone();
		phone3.make="Nokia";
		phone3.color="Black";
		phone3.memoryGigs=64;
		
		phone3.call();
		phone3.internet();
		phone3.photos();
		
		String str="Hello friends";
		
		str=str.replace("Hello", "Welcome");
		System.out.println(str);
		
	}

}
