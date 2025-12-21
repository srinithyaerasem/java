package com.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Inital {
	public static void main(String[] args) {
		Map<String,String> student = new HashMap<String,String>();
		System.out.println("is the map empty:"+student.isEmpty());
		student.put("name", "Nithya");
		student.put("roll no:","4247");
		student.put("greet", null);
		student.put(null, null);
		System.out.println(student.keySet());
		System.out.println(student.values());
		System.out.println(student.containsKey("name"));
		System.out.println(student.containsValue("Nithya"));
		System.out.println("the size is:"+student.size());
		System.out.println("is the map empty:"+student.isEmpty());	
		System.out.println(student);
		
		
		//LINKEDHASHMAP
		System.out.println("LINKEDHASHMAP");
		Map<String,String> student1 = new LinkedHashMap<String,String>();
		System.out.println("is the map empty:"+student1.isEmpty());
		student1.put("name", "Nithya");
		student1.put("roll no:","4247");
		student1.put("greet", null);
		student1.put(null, null);
		System.out.println(student1.containsKey("name"));
		System.out.println(student1.containsValue("Nithya"));
		System.out.println(student1.keySet());
		System.out.println(student1.values());
		System.out.println("the size is:"+student1.size());
		System.out.println("is the map empty:"+student1.isEmpty());	
		System.out.println(student1);
		
		
		//TREEMAP
		System.out.println("TREEHMAP");
		Map<String,String> student2 = new TreeMap<String,String>();
		System.out.println("is the map empty:"+student2.isEmpty());
		student2.put("name", "Nithya");
		student2.put("roll no:","4247");
		student2.put("greet", null);
//		student2.put(null, null);
		// TREEMAP doesn't accept "null" as "key
		System.out.println(student2.containsKey("name"));
		System.out.println(student2.containsValue("Nithya"));
		System.out.println(student2.keySet());
		System.out.println(student2.values());
		System.out.println("the size is:"+student2.size());
		System.out.println("is the map empty:"+student2.isEmpty());	
		System.out.println(student2);
		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Mango");
		System.out.println(map.get(2)); // Banana
		
		
	}

}



