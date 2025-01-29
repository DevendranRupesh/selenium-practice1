package org.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap {
	public static void main(String[] args) {// Linked HashMap
		
		Map<Object,Object>name= new LinkedHashMap<Object,Object>();
		
		name.put(1, "Rohit");
		name.put(2, 56);
		name.put(1, 0.3546);
		name.put(1, "kumar");
		name.put(null, null);
		name.put(12.3, 874);
		name.put(true, false);
		name.put(1, "rupesh");
		
		
		System.out.println(name);
		
		System.out.println(name.containsKey(2));
		
		System.out.println(name.containsValue(56));
		
		System.out.println(name.get(1));
		
		System.out.println(name.getOrDefault(12.3, 874));
		
		System.out.println(name.isEmpty());
		
		System.out.println(name.remove(1));
		
		System.out.println(name.remove(2));
		
		System.out.println(name.remove(null, null));
		
		System.out.println(name.replace(1, "Ramesh"));
		
		System.out.println(name.size());
		
		System.out.println(name.keySet());
		
		System.out.println(name.values());
		
		System.out.println(name.remove(12.3));
		
		
	

}
	
	
	
}
