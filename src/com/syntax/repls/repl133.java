package com.syntax.repls;

public class repl133 {
	
		  static String newWord;
		  public  static String alphabetical(String str) {
		    newWord=""+str.charAt(0);
		    for(int i=0;i<str.length()-1;i++) {
		      if(str.charAt(i)<str.charAt(i+1)) {
		        newWord=newWord+str.charAt(i+1);
		        
		      }
		      
		      
		    }
		    return newWord;
		  }

			
			//test case below (dont change):
			public static void main(String[] args){
				System.out.println(alphabetical("language")); //"hlo"
			}
		}
	
	
	

