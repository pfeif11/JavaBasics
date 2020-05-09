package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HW1 {
//	Store configuration in property file to create an Amazon account:
//		browser
//		url
//		name
//		email
//		password
	public static void main (String[]args) throws IOException {
		String filePath="C:\\Users\\pfeif\\eclipse-workspace\\JavaBasics\\configs\\Amazon.properties";
		System.out.println(filePath);
		FileInputStream fis=new FileInputStream(filePath);
		Properties prop=new Properties();
		prop.load(fis);
		
		if(prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		//	WebDriver driver-new ChromeDriver();
			
		}
		
		
	}

}
