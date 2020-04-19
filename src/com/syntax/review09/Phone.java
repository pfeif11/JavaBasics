package com.syntax.review09;

public class Phone {
	private String serialNumber;
	private String brand;
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
//brand is view only
	public String getBrand() {
		return brand;
	}

	double price;
	
	public Phone(String serialNumber, String brand) {
		this.serialNumber=serialNumber;
		this.brand=brand;
	}
	
	public void displayInfo() {
		System.out.println("This is a "+brand+" phone with serial number "+serialNumber);
		System.out.println("It costs $"+price);
	}

}
