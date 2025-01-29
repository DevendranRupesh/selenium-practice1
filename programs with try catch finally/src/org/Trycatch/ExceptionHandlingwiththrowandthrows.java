package org.Trycatch;

public class ExceptionHandlingwiththrowandthrows {// using throw and throws option
	
	public static void checkage(int age) {
		
		if(age<18) {
			
			throw new ArithmeticException("Acess denied-you must be atleast 18");
		}else {
			
			System.out.println("you are granted to vote");
			
			
		}
	}
	
	public static void main(String[] args) {
		
		checkage(15);
		
		
		
		
	}

}
