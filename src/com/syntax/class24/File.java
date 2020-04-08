package com.syntax.class24;

abstract public class  File {

	 public abstract void open();
	
	public void edit() {
		System.out.println("File can be edited");
	}
	
	public void close() {
		System.out.println("File can be closed");
	}
}

class JavaFile extends File {
	public void open() {
		System.out.println("Open a Java File");
	}
}

class WordFile extends File {
	public void open() {
		System.out.println("Open a word file");
	}
}

class PDFFile extends File {
	public void open() {
		System.out.println("Open a PDF File");
	}
	
}
