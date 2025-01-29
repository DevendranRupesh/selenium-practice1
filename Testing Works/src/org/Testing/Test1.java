package org.Testing;

import java.util.Scanner;

public class Test1 {//  Scanner class
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the name:");
		   
		  String name=sc.nextLine();
		  
		System.out.println("Enter the age:");
	    
	   int age= sc.nextInt();
	   
	   System.out.println("mobile no:");
	   
	   long no= sc.nextLong();
	   
	   String name1=sc.nextLine();
	   
	   System.out.println("Address for communication:");
	   
	    boolean bg =sc.hasNextBoolean();
	    
	    System.out.println("Rupesh");
	   
	   
	  
	  //Display the user input
	  
	  
	  System.out.println("Hello myself !"+ name + "you are "+ age+ " Mobile No"+ no +"Address" + name1+ "Rupesh"+ bg);
      
	  
	  sc.close();
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}
	
	

}
