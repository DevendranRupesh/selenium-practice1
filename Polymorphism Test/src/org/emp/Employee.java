package org.emp;

public class Employee {
      int i=1024;
      int j=2024;
      static String s="Rajesh";
      
	void method1(int i) {
		
		System.out.println("emp id:"+i);
	}
	
	void mehod2(int j) {
		System.out.println("emp id:"+j);
	}
	
	void method3 (String S) {
		System.out.println("emp Name:"+S);
	}
	
	void method4 (String S,int i) {
		
		System.out.println("emp name:"+S);
		System.out.println("Emp id:"+i);
	}
	
	public static void main(String[] args) {
		
		//object creation
		
		Employee obj= new Employee();
		obj.method1(6412);
		obj.mehod2(8142);
		obj.method3("Ramesh");
		obj.method4(s, 6412);
		
		
		
		
	}
	
}
