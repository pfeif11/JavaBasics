package com.syntax.repls;

public class Practice {
	
	Practice(){
		
	}
	
	public static void main(String[] args) {
		Practice obj=new Practice();
		obj.print2();
		SecondClass ob2=new SecondClass();
		ob2.hello();
	}
	
	void print1() {
		System.out.println("Print the 1st one");
	}
	
	void print2() {
		print1();
		System.out.println("print second one");
	}

}

 class SecondClass extends Practice {
	SecondClass() {
		
	}
	void hello() {
		super.print2();
		System.out.println("Hello");
	}
}
