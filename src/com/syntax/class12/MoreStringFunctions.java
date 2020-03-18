package com.syntax.class12;

public class MoreStringFunctions {
	public static void main(String[] args) {
		
		String me="I am a good tester";
		System.out.println("-----------replace() FUNCTION------------");
		//replace old value with new value
		String newString=me.replace("a", "c");
		System.out.println(newString);
		//if it finds matching char sequence, then replace will happen
		newString=me.replace("good", "great");
		System.out.println(newString);
		//if it is not finding matching sequence, it's not going to replace
		me=me.replace("Great", "Awesome");
		System.out.println(newString);
		
		String car="I have a toyota";
		car=car.replace("toyota", "Lexus");
		System.out.println(car);
		
		System.out.println("--------------replaceAll() FUNCTION");
		
		String str="Phone number 7037322525";
		System.out.println(str);
		str=str.replaceAll("[A-Za-z]", "");
		System.out.println(str);
		
		String str1="Hello12345*&(*^*&%%$^$$^*&    *(89";
		str1=str1.replaceAll("[0-9]","");
		System.out.println(str1);
		
		str1=str1.replaceAll("[^A-Za-z]", "");
		System.out.println(str1);
		
		String str2="Hello123^^&%&^%^**^";
		str2=str2.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str2);
		
		String str3="Hello All students";
		str3=str3.replaceAll(" ", "");
		System.out.println(str3);
		
		String subject="Java";
		
		subject=subject.replace("a", "e").replace("J", "I");
		
		System.out.println(subject);
		subject=subject.replaceFirst("e","g");
		System.out.println(subject);
	}

}
