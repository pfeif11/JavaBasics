package com.syntax.class11;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner shasta=new Scanner(System.in);
		System.out.println("Please enter username");
		String username=shasta.nextLine();
		System.out.println("Please enter password");
		String password=shasta.nextLine();
		
		boolean empty=true;
		boolean empty2=true;
		if(empty==username.isEmpty() || empty2==password.isEmpty()) {
			System.out.println("Please do not leave username or password blank");
		} else {
			if(password.length()<8) {
				System.out.println("Password is too short");
			}
			else {
				if(password.contains(username)) {
					System.out.println("Password cannot contain username");
					
				}
				else { System.out.println("Please enter password again");
				String password2=shasta.nextLine();
					if(password.equals(password2)) {
						System.out.println("Your username and password have been created");
					}
					else {
						System.out.println("Your passwords do not match");
					}
					
				}
			}
		}
			
	}

}
