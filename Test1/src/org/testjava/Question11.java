package org.testjava;

import java.util.Scanner;

public class Question11 {//QUESTION 2:Write a program to find even or odd number


	public static void main(String[] args) {// method1
		
		int i=10;
		
		if(i%2==0) {
			
			System.out.println("Even Number");
			
		}
		
		else {
			
			System.out.println("odd number");
			}
		
		for(int j1=1; j1<=10; j1++) {//method2
			
			if(j1%2==0) {
				
				System.out.println(j1+"");
				
				System.out.println("Even Number:"+j1);
				
			}
			
			else {
				
				System.out.println("Odd Number:"+j1);
			}
		Scanner sc= new Scanner(System.in); //method 3
			
		System.out.println("The even number is :");
			
		int s= sc.nextInt();
			}
		
	}
}
