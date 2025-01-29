package org.string;

public class Stringclass {

	
	public static void main(String[] args) {
		
		String A = "Java Class";
		String B ="Python Class";
		
		System.out.println(A);
		System.out.println(B);
		
		//1.length of the String
		
		System.out.println(A.length());
		
		//2.equals
		
		System.out.println(A.equals(B));
		
		//3.uppercase
		System.out.println(A.toUpperCase());
		
		//4.Lower case
		System.out.println(B.toLowerCase());
		//5.chartAt
		
		System.out.println(A.charAt(5));
		//6.indexof
		
		System.out.println(B.indexOf(B));
		
		//7.last index off
		
		System.out.println(B.lastIndexOf(B));
		
		//8.contains
		System.out.println(A.contains(B));
		
		//9.Starts with
		System.out.println(B.startsWith("python"));
		
		
		//10.Ends with
		System.out.println(B.endsWith("Class"));
		
		//11.Trim
		System.out.println(A.trim());
		
		//12.replace
		System.out.println(A.replace("J", "M"));
		
		//13.Concatination
		
		System.out.println(A.concat(B));
		
		//14.is Empty
		
		System.out.println(B.isEmpty());
		
		
		
		
		
	}
}
