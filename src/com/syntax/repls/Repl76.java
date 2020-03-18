package com.syntax.repls;

import java.util.Scanner;

public class Repl76 {
	 public static void main(String[] args) {
		    Scanner shasta=new Scanner(System.in);
		    
		    String[] days=new String [7];
		    for(int x=0;x<days.length;x++) {
		      System.out.println("Please enter day "+(x+1)+" of the week") ;
		      String day=shasta.nextLine();
		      days[x]=day;
		      
		    }
		    for(String day:days) {
		    	System.out.println(day);
		    }
		  }

}
