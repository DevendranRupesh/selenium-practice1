package org.phone;

public class Phone {
	
	void PhoneInfo(int a) {
		System.out.println("Model no:"+a);
	}
	void PhoneInfo2(int a1) {
		System.out.println("Model no:"+a1);
	}
	void PhoneInfo(String S) {
		System.out.println("Model name:"+S);
	}

	void PhoneInfo(String c, String u) {
		System.out.println("Model name:"+c);
		System.out.println("Model name:"+u);
	}
public static void main(String[] args) {
	
	Phone obj= new Phone ();
	obj.PhoneInfo("1100");
	obj.PhoneInfo("6565");	
	obj.PhoneInfo("Nokia");
	obj.PhoneInfo("Samsung", "Nokia");
}

}
