package com.syntax.class25;

public class WebDriverTest {
	public static void main(String[] args) {
		
		WebDriver obj1=new ChromeDriver();
		obj1.openBrowser();
		obj1.closeBrower();
		obj1.maximizeWindow();
		obj1.findElement();
		
		WebDriver obj2=new FirefoxDriver();
		obj2.openBrowser();
		obj2.closeBrower();
		obj2.maximizeWindow();
		obj2.findElement();
	}

}
