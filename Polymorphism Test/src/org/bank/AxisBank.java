package org.bank;

public class AxisBank extends BankInfo{
	
	void method1() {
		
		System.out.println("Saving Account");
	}
    void method2() {
		
		System.out.println("Fixed Account");
	}
    void method3() {
	
	System.out.println("Deposit Account");
}
    
    public static void main(String[] args) {
		
    	//object creation
    	
    	AxisBank obj= new AxisBank();
    	obj.method1();
    	obj.method2();
    	obj.method3();
	}
}
