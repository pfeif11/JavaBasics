package com.syntax.review06;

public class School {
	public static void main(String[] args) {
		MathOperations math=new MathOperations();
		
		int result=math.add(4, 5);
		math.addNoReturn(4, 5);
		System.out.println(math.add(4,5));
		
		result=math.multiply(3, 4);
		System.out.println("multiplication result is "+result);
		
	}

}
