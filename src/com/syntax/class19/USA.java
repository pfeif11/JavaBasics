package com.syntax.class19;

public class USA {
	
	String state, stateCapital;
	
	public USA(String state, String stateCapital) {
		
		this.state=state;
		this.stateCapital=stateCapital;
	}
	
	public void displayState() {
		System.out.println(state);
	}
	
	public void displayStateCapital() {
		System.out.println(stateCapital);
	}
	
	public void displayInfo() {
		displayState();
		displayStateCapital();
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		USA state1=new USA("Texas","Austin");
		System.out.println(state1.state);
		state1.displayState();
		state1.displayStateCapital();
		
		state1.displayInfo();
		System.out.println("--------------------------------");
		state1=new USA("Georgia", "Atlanta");
		state1.displayInfo();
	}

}
