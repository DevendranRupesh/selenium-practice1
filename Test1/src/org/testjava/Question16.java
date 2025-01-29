package org.testjava;

import java.util.Scanner;

public class Question16 {//Write a program to find the factorial of a number.
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int number =sc.nextInt();
		
		
       sc.close();
		
	  long factorial=1;
		for(int i=1;i<number;i++) {
			
			factorial *=i;
			
			System.out.println("Factorial of " + number + "is: " + factorial);
		}
	}

}
