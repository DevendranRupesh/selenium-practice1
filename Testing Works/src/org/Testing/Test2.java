package org.Testing;

public class Test2 {//Nested for loop 
	
	public static void main(String[] args) {
		
		int weeks=4;
		int days=7;
		
		//outer loop prints weeks
		
		for(int i=1; i<=weeks;i++) { // for days 1<=2 print Week:1 till Week :2
			
			System.out.println("Weeks:"+i);
		
		//inner loop prints days
		
		for(int j=1;j<=days;j++) {     //1<=7  print Day:1
			                                //2<=7 print Day:2 upto 7<=7 it prints
			System.out.println("Days:"+j);
		}
		
		System.out.println();
	}
		
	
	}
	
}

