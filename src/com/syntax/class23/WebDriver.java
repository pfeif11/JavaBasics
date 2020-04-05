package com.syntax.class23;

public class WebDriver {
	
	public void open() {
		System.out.println("Opening the browser");
	}
}
	class FireFoxDriver extends WebDriver {
		
		public void open() {
			System.out.println("Opening Firefox Browser");
		}
	}
	
	class ChromeDriver extends WebDriver {

		public void open() {
			System.out.println("Opening Chrome Browser");
		}

	}
	
	class IEDriver extends WebDriver {
		public void open() {
			System.out.println("Opening IE Browser");
		}
	}


