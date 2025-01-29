package org.constructor;

public class Nonparametrized {// class
	
	int a;
	String w;
	
	public Nonparametrized() {// method 
		a=12;
		w= "ramesh";          //variable
		
	}
	
	public static void main(String[] args) {
		
		Nonparametrized obj= new Nonparametrized();
		System.out.println(obj.a);
		System.out.println(obj.w);
	}
	}


