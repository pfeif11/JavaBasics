package com.syntax.class14;

public class Main {
	String name;
	  int roll_no;
	  
	  
	     void greeting() {
	       System.out.print("Name is "+name);
	     }
	     void greeting2() {
	       System.out.print(" and roll number is "+roll_no);
	     }
	  public static void main(String[] args) {
	     Main var1=new Main();
	     var1.name="John";
	     var1.roll_no=2;
	     
	     var1.greeting();
	     var1.greeting2();
	    
	  }
}
