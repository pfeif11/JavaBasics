package com.syntax.class12;

public class StringManipulations {
	public static void main(String[] args) {
		
		String str="Good Morning Students!";
		
		char letter1=str.charAt(0);
		System.out.println(letter1);
		
		char letter5=str.charAt(4);
		System.out.println("Letter at index 4 is "+letter5+".");//returns the space
		
		//char someLetter=str.charAt(55); - RunTime Exception --->StringIndexOutOfBoundsException
		char letters;
		for(int x=0;x<str.length();x++ ) {
			letters=str.charAt(x);
			System.out.print(letters+" ");
		}
		System.out.println();
		System.out.println("--------------indexOf() FUNCTION-------------");
		String name="Syntax Technologies";
		int index=name.indexOf("y"); //it's going to return you the first occurence
		System.out.println(index);
		index=name.indexOf("Syntax");
		System.out.println(index);
		
		index=name.indexOf("!");
		System.out.println("Index of not existing character" +index);
		
		index=name.indexOf("Technologies");
		System.out.println("Index of substring Technologies="+index);
		
		index=name.indexOf("o");
		System.out.println(index);
		index=name.lastIndexOf("o");
		System.out.println(index);
	}

}
