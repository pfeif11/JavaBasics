package com.syntax.class19;

public class Book {
	String title, author;
	int pages;
	
	public Book() {
		
		System.out.println("This is my favorite book");
	}
	
	public Book(String title, String author, int pages) {
		this();
		this.title=title;
		this.author=author;
		this.pages=pages;
		System.out.println("The book name is "+title+" written by "+author+" is "+pages+" pages long");
	}
	
	public static void main(String[] args) {
		
		Book book1=new Book("The Hunger Games", "Suzanne Collins", 500);
		
		
	}
	

}
