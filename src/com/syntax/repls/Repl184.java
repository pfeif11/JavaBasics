package com.syntax.repls;
import java.util.LinkedList;
import java.util.Iterator;
public class Repl184 {
	

	
	  
	public static void main (String[] args) {
	    
		  LinkedList<Integer> nums=new LinkedList<>();
		   int a=0;
		   int b=1;
		   int c;
		   
		  for(int x=0;x<10;x++) {
		    nums.add(a);
		    c=a+b;
		    a=b;
		    b=c;
		  }
		    
		    
		    
		  Iterator<Integer> fib=nums.iterator();
		    
		  while(fib.hasNext()) {
		    System.out.print(fib.next()+" ");
		  }
	    
	    
	    
	  }
	 
	}
