package com.syntax.class23;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer [] comps= {new Apple("Apple"), new Lenovo("Lenovo"), new HP("HP"), new Dell("Dell") };
		
		for(Computer c:comps) {
			c.display();
			c.login();
		}
	}
}
