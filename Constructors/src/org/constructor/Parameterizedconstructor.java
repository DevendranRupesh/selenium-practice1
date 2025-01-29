package org.constructor;

public class Parameterizedconstructor {

	int number;
	String word;
	
	

	public Parameterizedconstructor(int a, String w) {
		number=a;
		word= w;
	}
	
	public static void main(String[] args) {
Parameterizedconstructor obj= new Parameterizedconstructor(15,"hello");
		 
	System.out.println(obj.number);
	System.out.println(obj.word);
		 
		
		
	}
	
}
