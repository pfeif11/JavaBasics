package com.syntax.repls;

import java.util.Scanner;

public class Repl92 {
	public static void main(String[] args) {
	    Scanner shasta=new Scanner(System.in);
	    
	    String word=shasta.next();
	    
	    System.out.println("The first 3 letters of "+word+" is "+word.substring(0,3));
	  }

}
