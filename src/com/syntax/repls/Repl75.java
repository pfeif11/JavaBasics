package com.syntax.repls;

public class Repl75 {
	
	public static void main(String[] args) {
	    int[] numbers={45,78,12,67,55,89,23,77,88};
	    //78 13 11             55
	    for(int x=7;x>=0;x--) {
	    	
	    	if(x==7 || x==2) {
	    		 System.out.print(numbers[x]+1+" ");	
	    	}
	    	if(x==0) {
	    		System.out.print(numbers[x]-34);
	    	}
	     
	    }
	  }

}
