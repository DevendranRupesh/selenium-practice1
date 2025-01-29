package org.polymorphism;

public class Polymorphismsample1 extends Polymorphismsample {
	
	//method overriding or dynamic polymorphism
	
 // method will be same and parameter also will be same But particular  logic from parent class will be changed in child class.
	void method1(int a,int b) {
		System.out.println(a*b);
	}
	
	void method1(String b) {
		System.out.println(b);
	}
	
	void method1 (int a, String b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Polymorphismsample1 objc= new Polymorphismsample1();
		objc.method1(35, 10);
		objc.method1("Ravi");
		objc.method1(10, "Ravi");
		
		
	}
	

}
