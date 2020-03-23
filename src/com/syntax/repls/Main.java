package com.syntax.repls;

public class Main { 
String censorLetter(String word,char c) {
    String newWord=word.replace(c,'*');
    return newWord;
    
    
    
  }
  
  
  
  public static void main(String [] args) {
    
    Main obj=new Main();
    System.out.println(obj.censorLetter("computer science",'e'));
    System.out.println(obj.censorLetter("trick or treat",'t'));
    
    
    
    
    
  }
}