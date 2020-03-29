package com.syntax.class18;

public class ConstructorsDemo {
	
	static String str="Hello";
	//non argument constructor
	ConstructorsDemo() {
		System.out.println("I am your constructor");
		System.out.println("I am non argument constructor");
			
	}
	//constructor with parameters
	ConstructorsDemo(String str) {
		System.out.println("I am a constructor with 1 String parameter "+str);
	}
	//constructor with parameters
	ConstructorsDemo(int num) {
		System.out.println("I am a constructor with 1 integer value="+num);
	}
	//constructor with parameters
	ConstructorsDemo(String str, int num) {
		System.out.println("I am a constructor with 2 parameters:"+str+" & "+num);
	}
	
	void ConstructorsDemo() {
		System.out.println("I do not know who I am");
	}
	public static void main(String[] args) {
		//ConstructorsDemo obj=new ConstructorsDemo();
		System.out.println(str);
		ConstructorsDemo obj=new ConstructorsDemo();
		ConstructorsDemo obj1=new ConstructorsDemo("Today is Java");
		ConstructorsDemo obj2=new ConstructorsDemo(12);
		ConstructorsDemo obj3=new ConstructorsDemo("Hello",12);
		ConstructorsDemo obj4=new ConstructorsDemo();
		obj1.ConstructorsDemo();
	}
	

}
