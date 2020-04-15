package com.syntax.class26;

public class Registration {

	private String email;
	private String userName;
	private String password;

	public String getEmail() {
		{
			return email;
		}

	}

	public String getUsername() {
		return userName;
	}

	public String getPassword() {

		return password;
	}

	public void setEmail(String email) {
		if (email.contains("yahoo")) {
			this.email = email;
		} else {
			System.out.println("Please use only yahoo account");
		}

	}

	public void setUserName(String userName) {
		if (!userName.isEmpty()) {
			
			if(userName.length() > 6) {
				this.userName = userName;
			} else {
				System.out.println("Username is too short");
			}
		} else  {
			System.out.println("Username cannot be empty");
		}
		

	}

	public void setPassword(String password) {
		if (!password.isEmpty()) {
			if(password.length() > 6) {
				if (!password.contains(userName)) {
					this.password = password;	
				} else {
					System.out.println("password cannot contain username");
				}
			}
			else {
				System.out.println("Password needs to be 6 characters or longer");
			}
			
		} else {
			System.out.println("Your password cannot be empty");
		}

	}

}
