package com.syntax.class15;

public class Hello {
	void sayHello(String language) {
		if(language.equalsIgnoreCase("English")) {
			System.out.println("Hello");
		}
		if (language.equalsIgnoreCase("Spanish")) {
			System.out.println("Hola");
		}
		if (language.equalsIgnoreCase("Polish")) {
			System.out.println("Czesc");
		}
		if (language.equalsIgnoreCase("Portuguese")) {
			System.out.println("Ola");
		}
		if (language.equalsIgnoreCase("French")) {
			System.out.println("Bonjour");
		}
			
	}
	public static void main(String[] args) {
		Hello h=new Hello();
		
		h.sayHello("Polish");
		h.sayHello("English");
		h.sayHello("portuguese");
		h.sayHello("spanish");
	}

}
