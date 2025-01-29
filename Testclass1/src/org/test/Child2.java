package org.test;

public class Child2 extends Hierarchicalinheriatnce{
	
	void method2() {
		
		System.out.println("propety 3");
	}
	
	
	public static void main(String[] args) {
		
		Child2 ref= new Child2();
		
		ref.method1();
		ref.method2();
	}

}
