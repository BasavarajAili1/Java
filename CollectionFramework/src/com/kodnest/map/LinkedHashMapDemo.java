package com.kodnest.map;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap map1 = new LinkedHashMap<>();
		map1.put(1, 11);
		map1.put(2, 123);
		map1.put("Three", new Student(1, "Mahesh", 7.6));
		map1.put("Four", 101);
		map1.put(5, 5555);
		System.out.println(map1);
		
		Set keys = map1.keySet();
		System.out.println("Keys = "+keys);
		
		Set kv = map1.entrySet();
		System.out.println("Key-values = "+kv);
		
		Collection values = map1.values();
		System.out.println("Values = "+values);

	}

}
