package org.scanner;

import java.util.Scanner;

public class Scannerexample {

	
	

	//main method
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your Name:");
		
		String name= scanner.nextLine();
		
		System.out.println("Enter your Age:");
		
		int age= scanner.nextInt();
		
		System.out.println("The User Float Value is:");
		
		float f= scanner.nextFloat();
		
		System.out.println("Mobile No is:");
		
		double d= scanner.nextDouble();
		
		System.out.println("House Mobile No is:");
		
		String mobile= scanner.next();
		
		System.out.println(scanner.nextLine());
		
		// print the input values
		
		System.out.println("Hello, " + name + "! You are " + age + " years old"+d+"Mobile Number");
		System.out.println("float value"+f);
		System.out.println("Mobile no :"+mobile);
		System.out.println("Print the next line:"+mobile);
		System.out.println("Print the next line:"+mobile);
		System.out.println("Print the next line:"+mobile);
		
		scanner.close();
		
		       
		      
		    }

         }
	  
		
		
	

