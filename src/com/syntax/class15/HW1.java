package com.syntax.class15;

public class HW1 {
	//Create a method createEmail(). Based on provided users name, lastName and email type, 
	//your method should return complete email Address. Example: johnsnow@gmail.com or johnsnow@yahoo.com*

	 String createEmail(String name, String lastName, String emailType) {
		
		 String str=(name+lastName+"@"+emailType+".com");
		 return str;
		
	}
	 public static void main(String [] args) {
		 HW1 obj=new HW1();
		 System.out.println(obj.createEmail("john","snow", "gmail"));
	 }
}