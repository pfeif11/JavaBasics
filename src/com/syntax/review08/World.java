package com.syntax.review08;

public class World {
	
	public static void main(String[] args) {
		Human.planet="World";
		
		Human h1=new Human("Turker");
		System.out.println("The best student is "+h1.name);
		
		
		Human h2=new Human("Gulbahar");
		
		System.out.println(h2.name+" lives in "+Human.planet);
		
		h1.talk();
		h2.talk();
		
		Turkish t1=new Turkish("Ali");
		System.out.println(t1.name+" lives in "+Human.planet);
		t1.talk();
		//upcasting/widening/implicitly
		Human b1=new Belarusan("Vitali");
		b1.talk();
		//downcasting/narrowing/explicitly
		Belarusan bela=(Belarusan) b1;
		bela.pickMushrooms();
		
		Human[] people=new Human[6];
		people[0]=h1;
		people[1]=h2;
		people[2]=t1;
		people[3]=b1;
		people[4]=new Turkish("Veli");
		people[5]=new Belarusan("Olga");
		
		for(Human person:people) {
			person.talk();
		}
				
		
				
		
	}

}
