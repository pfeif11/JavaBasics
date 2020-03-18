package com.syntax.class04;

public class IfNesting3 {
	public static void main (String [] args) {
		//check if patient has any allergies
		//no allergies --- you are healthy
		//otherwise check if patient has:
		// orange allergy --- do not eat oranges
		// apple allergy --- do not eat apples
		//kiwi allergy --- do not eat kiwi
		
		boolean allergies=true;
		boolean appleAllergy=true;
		boolean orangeAllergy=true;
		boolean kiwiAllergy=false;
		
		if(allergies) {
			System.out.println("Please answer below");
			if(appleAllergy) {
				System.out.println("do not eat apples");
			}
			if (orangeAllergy) {
				System.out.println("do not eat oranges");
			}
			if (kiwiAllergy) {
				System.out.println("do not eat kiwis");
			}
			
			
		}
		else {System.out.println("You are healthy");
		
		}
		
		
		
	}

}
