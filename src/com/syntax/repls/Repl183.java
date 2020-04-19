package com.syntax.repls;

import java.util.Iterator;
import java.util.LinkedList;

public class Repl183 {

	public static void main(String[] args) {
	    
	    LinkedList<Integer> numbers=new LinkedList<>();
	    
	    for(int i=50;i<=100;i++) {
	      numbers.add(i);
	    }
	    
	    Iterator<Integer> n=numbers.iterator();
	    
	    while(n.hasNext()) {
	      int obj=n.next();
	      if(obj%3!=0) {
	        numbers.remove();
	      }
	    }
	    
	    System.out.print(numbers);
	  }
}
