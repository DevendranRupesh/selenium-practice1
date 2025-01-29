package com.poly;

public class Polymorphism2 extends polymorphism1 {
	
	void method1(int a, int b) {
		System.out.println(a+b);
		
		super.method1(a+b, b);// logic which i had given is changed 
		
		
	}
	public static void main(String[] args) {
		
		Polymorphism2 ref= new Polymorphism2();
		ref.method1(20, 40);
	}

}
