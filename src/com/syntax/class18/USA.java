package com.syntax.class18;

public class USA {
	//create variables to hold state and capital of the state
	String state,capital;
	
	//create method to display state and state capital
	public void display() {
		System.out.println(state+" and its' capital is "+capital);
	}
	
	public USA(String state, String capital) {
		this.state=state;
		this.capital=capital;
		
	}
	
	public static void main(String[] args) {
		USA usa=new USA("Virginia","Richmond");
		usa.display();
		
	}

}
