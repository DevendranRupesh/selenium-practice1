package org.testjava;

public class Question15 {// Count of even number 1 to 100

	public static void main(String[] args) {
		
		int count=0;
		
		for(int i=1;i<=100;i++) {
			
			if(i%2==0) {
				
				count++;
						
			}
		}
				System.out.println("count of even numbers:"+count);
			}
		
	}


