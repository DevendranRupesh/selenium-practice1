package org.arithmetic;

public class Arithmeticoperations {
	
	//initialization int i= value
	// operators used in arithmetic (+-/*%)
	
	//variable 
	public static void main(String[] args) {
		
	
	int a=10;  //Arithmetic operator
	int b=5;
	
	
	System.out.println("Addition:" +(a+b));
	System.out.println("Subraction:"+(a-b));
	System.out.println("Multiplication:"+(a*b));
	System.out.println("Division:"+(a/b));
	System.out.println("Modulo:"+(a%b));
	
	int x=15; //Assignment operators
	int y=20; // += -= *= /= %=
	
	System.out.println("y+=x:"+(y+=x));
	System.out.println("y-=x:"+(y-=x));
	System.out.println("y*=x:"+(y*=x));
	System.out.println("y/=x:"+(y/=x));
	System.out.println("y%=x"+(y%=x));
	
	 //Logical operators-- Boolean 
	  //  &&,||
	
	boolean p= true;
	boolean q= false;
	
	System.out.println("p&&q:"+(p&&q));
	System.out.println("p||q:"+(p||q));
	
	//postincremental or post deceremental
	
	 for(int a1=0;(a1<=10);a1++) {
		
		System.out.println(a1);
		
		
		//Relational Operators
		
		//<,>,<=,>=,==
		
		int c=20;
		int d=50;
		
		System.out.println("a<b:"+(a<b));
		System.out.println("a>b:"+(a>b));
		System.out.println("a<=b:"+(a<=b));
		System.out.println("a>b:"+(a>=b));
		System.out.println("a==b:"+(a==b));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

    }

}