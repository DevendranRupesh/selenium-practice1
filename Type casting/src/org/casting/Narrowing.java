package org.casting;

public class Narrowing {
	
	public static void main(String[] args) {
		
		double a=37.89;
		int value= (int) a;
		
		System.out.println(value);
		
		float b=(float) 0.378;
		int value1=(int) b;
		System.out.println(value1);
	}

}
