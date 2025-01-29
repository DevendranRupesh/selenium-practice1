package org.polymorphism;

public class Polymorphismsample { // poly-many  morphism -forms  which means performing the same task in many ways.
	int a=10;
	int b=20;
	String c= "ravi";
			
	//method overloading or Static polymorphism
	
	//method will be same in class and parameters will be given different int, string
	void method1() {
		
		System.out.println( "Without parameter");
		}
	
	static void method1(int a) {// if static has been declared in method then no need to create object.
		System.out.println(a);
	}
	
	  void method1(String b) {
		System.out.println(b);
	}
	
	void method1 (int a,int b) {
		System.out.println(a+b);
	}
	
	void method1(int a,String b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		Polymorphismsample obj= new Polymorphismsample();
		
		obj.method1();
		Polymorphismsample.method1(2);
		obj.method1("Raju");
		obj.method1(25, 10);
		obj.method1(10, "ramesh");
		
		
	}

}
