package com.syntax.review09;

public class WrapperDemo {
	public static void main(String[] args) {
		
		int int1=5;
		Integer integer1=new Integer(int1); //Getting the primitive value and putting it in a box - Boxing
		
		int int2=integer1.intValue(); //getter, getting the value from inside and Unboxing
		System.out.println(int2);
		
		int int3=10;
		//Integer integer2=new Integer(int3); LONG WAY
		Integer integer3=int3; //Auto-boxing, Auto wrapping, Auto converting
	
		//int int4=integer3.intValue(); LONG WAY
		int int4=integer3; //Auto-unboxing, auto unwrapping, auto converting, auto casting
	
		//Double Wrapper class
		double d1=3;
		Double d2=d1;
		
		//it does not accept it in one step
		//Double d3=3;
		
		Double d4=3.0; //Auto-boxing
		
		double d5=d4.doubleValue(); //1st way, long way, unboxing
		double d6=d4; //2nd way, short way auto unboxing
		
		//Boolean is the choloate with a wrapper
		Boolean b1=new Boolean(true);
		//if we need the primitive value we un-box
		//boolean is the chocolate without the wrapper
		boolean b2=b1.booleanValue();
	}

}
