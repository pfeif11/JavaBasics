package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task {
	public static void main(String[] args) throws IOException {
		
		String filePath="C:\\Users\\pfeif\\eclipse-workspace\\JavaBasics\\configs\\Task.properties";
	
		FileInputStream fileInput=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fileInput);
		String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
		System.out.println(browser);
		System.out.println(url);
	
	}

}
