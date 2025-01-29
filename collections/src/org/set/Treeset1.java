package org.set;

import java.util.Set;
import java.util.TreeSet;

public class Treeset1 {
	public static void main(String[] args) {
		
		Set<String>name= new TreeSet<String>();
		
		name.add("Rupesh");
		//name.add(16124563);
		//name.add('r');
		name.add("rupesh");
		//name.add(null);// it will throw null pointer exception
		//name.add(null);
		System.out.println(name);
		
		
	}

}
