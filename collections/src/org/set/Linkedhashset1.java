package org.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset1 {
	
	public static void main(String[] args) {//linkeHashSet wont allow duplicate values
		
		Set<Object>name= new LinkedHashSet<Object>();
		
		name.add("rupesh");
		name.add('9');
		name.add(26458789);
		name.add(null);
		name.add('9');
		name.add(null);
		
		System.out.println(name);
		System.out.println(name.contains("rupesh"));
		System.out.println(name.isEmpty());
		System.out.println(name.remove('9'));
		System.out.println(name.equals(null));
		
	}

}
