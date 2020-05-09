package com.syntax.class34;

public class TryCatchFinally {
	
	
	public static int division(int num,int num1) {
		int result=0;
		try {
			System.out.println(num/num1); //new ArithmeticException
		} catch(ArithmeticException ae) {
			ae.printStackTrace(); //detailed message of an exception
			//System.out.println(ae.getMessage()); //print message of an exception
			//System.out.println(ae);
		} finally {
			System.out.println("I am a finally block");
		}
		return result;
	}

}
