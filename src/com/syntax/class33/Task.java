package com.syntax.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task {
	public static void main(String[] args) {
		List<Exception> list=getAllExceptions();
		System.out.println(list.size());
		Iterator<Exception> eit=list.iterator();
		while(eit.hasNext()) {
			String message=eit.next().getMessage();
			System.out.println(message);
		}
	}
	
	public static List<Exception> getAllExceptions() {
		List<Exception> exceptionList=new ArrayList<>();
		
		int [] array={1,2,3};
		try {
			System.out.println(array[4]);
		} catch (ArrayIndexOutOfBoundsException aob) {
			exceptionList.add(aob);
		}
		
		try {
			Object ob=new Double(50);
			Integer i=(Integer) ob;
		} catch (ClassCastException e) {
			exceptionList.add(e);
		}
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		} catch(ArithmeticException ae){
			exceptionList.add(ae);
		}
		
		
		
		
		
		
		
		return exceptionList;
	}

}
