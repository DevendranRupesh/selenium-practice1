package org.map;

import java.util.HashMap;
import java.util.Map;

public class MapHashmap {
	public static void main(String[] args) { //Map with HashMap
		
		Map<Object,Object>ref= new HashMap<Object,Object>();
		ref.put(1, "rupesh");
		ref.put(1, "rajesh");
		ref.put(1, "Rupesh");// wont print repeated values
		ref.put(2, "Kumar");
		ref.put(null,null);
		ref.put(12.3, 874);
		ref.put(true,false);
		
		System.out.println(ref);
		
		System.out.println(ref.size());
		
		                                               //contains key
		System.out.println(ref.containsKey(2));
		
		                                                  //contains value 
		System.out.println(ref.containsValue("Rupesh"));
		
	                                                      //is empty
		System.out.println(ref.isEmpty());
		
		                                                  //remove
		System.out.println(ref.remove(2));
		
		                                                  //remove with key and value
		System.out.println(ref.remove(null, null));
		
	                                                      //getkey
		System.out.println(ref.get(1));
		
		                                                   //keyset
		System.out.println(ref.keySet());
		
		                                                  //values
		System.out.println(ref.values());
		
	                                                      //contains value
		System.out.println(ref.containsValue("kumar"));
		
	}

}
