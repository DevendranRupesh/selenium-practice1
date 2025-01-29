package org.Trycatch;

public class Exceptionhandling {
	
	public static void main(String[] args) {//Exception handling with try catch finally
		
		
		try {                               //try exception will be handled between try and catch
			
		int [] arr= {1,3,55,68,8};
		
		System.out.println(arr[10]);
		
		}catch(ArrayIndexOutOfBoundsException e) {// in catch Exception will be given
			
			System.out.println(e);
			
		}finally {
			
			System.out.println("finally block is working ");
			
			
		}
			
			
		}

}
