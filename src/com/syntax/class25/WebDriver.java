package com.syntax.class25;

interface TakeScreenshot{
	String fileExtension=".png";
	void takePicture();
	
	//features below were added from Java 1.8 version
	
}



public interface WebDriver {

	void openBrowser();

	void closeBrower();

	void maximizeWindow();

	void findElement();
}

class ChromeDriver implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("Chrome opens browser");

	}

	@Override
	public void closeBrower() {
		System.out.println("Chrome closes browser");

	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome maximized window");

	}

	@Override
	public void findElement() {
		System.out.println("Chrome finds element");

	}

}

class FirefoxDriver implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("Firefox opens browser");

	}

	@Override
	public void closeBrower() {
		System.out.println("Firefox closes browser");

	}

	@Override
	public void maximizeWindow() {
		System.out.println("Firefox maximizes window");

	}

	@Override
	public void findElement() {
		System.out.println("Firefox finds element");

	}

}
