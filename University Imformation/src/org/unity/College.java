package org.unity;

public class College extends University{// overriding method
	
	void method1(String b) {
		
		System.out.println("ug");
	}
	
	void method2(String b) {
		
	System.out.println("pg");
	}
	
	public static void main(String[] args) {
		
		College obj= new College();
		
		obj.method1("java course");
		
		obj.method2("Selenium course");
		
		
		
	}

}
