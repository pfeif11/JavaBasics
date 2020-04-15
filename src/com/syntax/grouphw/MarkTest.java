package com.syntax.grouphw;

public class MarkTest {
	public static void main(String[] args) {
		
		Mark st1=new A(80,90,95);
		Mark st2=new B(70,80,90,100);
		System.out.println("Average of student A is "+st1.getPercentage());
		System.out.println("Average of student B is "+st2.getPercentage());
	}

}
