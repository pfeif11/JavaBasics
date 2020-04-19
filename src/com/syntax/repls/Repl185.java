package com.syntax.repls;

import java.util.ArrayList;
import java.util.Iterator;

public class Repl185 {
	 public static void main(String[] args) {
		    ArrayList<Boolean> listA=new ArrayList<>();
		    listA.add(true);
		    listA.add(false);
		    listA.add(false);
		    
		    ArrayList<Boolean> listB=new ArrayList<>(listA);
		    
		    Iterator<Boolean> print=listB.iterator();
		    
		    while(print.hasNext()) {
		      System.out.println(print.next());
		    }
		    
		  }

}
