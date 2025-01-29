package org.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1{
	
	public static void main(String[] args) {//list<object>refname= new linkedList<>();
		
		List<Object>words= new LinkedList<>();
		
		words.add("python");
		words.add(100);
		words.add(false);
		words.add('M');
		words.add(30.785);
		
		System.out.println(words);
		
		
		words.add(0, "value123");
		System.out.println(words);
		
	   System.out.println(words.get(1));
	   
	   words.set(5, "jaclass");
	   
	   System.out.println(words);
	   
	   words.contains("java");
	   
	   System.out.println(words.contains(1));
	   
	 
	   System.out.println(words.size());
	   
	   words.equals(4);
	   System.out.println(words.equals("ramesh"));
	   
	   words.remove(2);
	   System.out.println(words.remove(false));
	   
	   words.equals(3);
	   System.out.println(words.equals('M'));
	   
	   
	}

}
