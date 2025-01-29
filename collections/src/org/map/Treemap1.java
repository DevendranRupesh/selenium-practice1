package org.map;

import java.util.Map;
import java.util.TreeMap;

public class Treemap1 {

	public static void main(String[] args) {// Tree map
		
		Map<Object,Object>tr= new TreeMap<Object,Object>();
		
		tr.put("Selenium", "rajesh");// tr -refname
		tr.put("java", true);
		tr.put("Selenium", 345);
		tr.put("Cucumber", 'j');
		tr.put("JAVA", true);
		tr.put("JAVA", 12345);
		tr.put("GIT",true);
		
		System.out.println(tr);
		
		System.out.println(tr.containsKey("Selenium"));
		
		System.out.println(tr.containsValue("rajesh"));
		
		System.out.println(tr.get("Java"));
		
		System.out.println(tr.isEmpty());
		
		System.out.println(tr.remove("Cucumber"));
		
		System.out.println(tr.remove("JAVA"));
		
		System.out.println(tr.size());
		
		System.out.println(tr.remove("GIT", true));
		
		System.out.println(tr.keySet());
		
		System.out.println(tr.values());
		
		
		
	}
}
