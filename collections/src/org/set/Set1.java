package org.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		
		Set<Object> name= new HashSet<Object>();
		
		name.add("rupesh");
		name.add(3900);
		name.add('7');
		name.add("rupesh");
		name.add('7');
		name.add('7');
		
		System.out.println(name);
		
		System.out.println(name.size());
		
		System.out.println(name.contains("rupesh"));
		
		System.out.println(name.isEmpty());
		
		name.clear();
		System.out.println(name);
		
	}
}
