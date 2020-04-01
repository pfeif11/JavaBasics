package com.syntax.repls;

public class Repl134 {
		  
		  protected static String maxLength(String [] array) {
		    String longest="";
		    for(int i=1;i<array.length;i++) {
		      longest=array[0];
		      if(array[i].length()>longest.length()) {
		        longest=array[i];
		      }
		    }
		    return longest;
		  }
		  
		  
			
			public static void main(String[] args) {
				String[] arr = {"hey","yolo","hi","this is long"};
				System.out.println(maxLength(arr));
				//should print "this is long"
			}
			
		}


