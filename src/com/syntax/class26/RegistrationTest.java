package com.syntax.class26;

public class RegistrationTest {
	
	public static void main(String[] args) {
		
		Registration r1=new Registration();
		r1.setEmail("tina@yahoo.com");
		r1.setUserName("cpfeifer11");
		r1.setPassword("");
		
		System.out.println("The email is "+r1.getEmail()+" and the user name is "+r1.getUsername()+" and the password is "+r1.getPassword());
	}

}
