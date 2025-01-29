package org.list;

import java.util.*;

public class Arraylist {
	
	public static void main(String[] args) {//list<object>refname= new Arraylist<>();
		
		List<Object>list1= new ArrayList<>();
		
		list1.add("ramesh"); //string
		list1.add(100);    //integer
		list1.add(true); // boolean
		list1.add('s');   //character
		list1.add(0.352);  //float value
		System.out.println(list1);
		
		list1.add(0,"javaclass"); // will add values in particular index
		System.out.println(list1);
		
		
		System.out.println(list1.get(4));// will get value from particular index
		
		list1.set(1,"rajesh");
		
		System.out.println(list1);
		
		list1.remove(1);
		System.out.println(list1);// will remove particular index value
		
		System.out.println(list1.size());// Will get the Size or length of the index 
		
		System.out.println(list1.contains("String"));
		
		System.out.println(list1.contains("list1"));
		
		System.out.println(list1.isEmpty());
		
		list1.clear();
		System.out.println(list1);
		
		list1.equals("String");
		
		System.out.println(list1);
	}

}
