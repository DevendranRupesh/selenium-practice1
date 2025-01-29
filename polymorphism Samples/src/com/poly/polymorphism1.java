package com.poly;

public class polymorphism1 {// method overloading 
	
	void method1() {
		System.out.println("Without giving any parameter");
	}
	
	void method1(int a) {//in method overloading methods given will be same 
		System.out.println(a);
		
	}
	
	void method1(String c) {// parameters given inside will be different
		System.out.println(c);
	}
	void method1(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		polymorphism1 ref= new polymorphism1();
		
		ref.method1();
		ref.method1(20);
		ref.method1("ramesh");
		ref.method1(30, 40);
		
	}
	
 
}
