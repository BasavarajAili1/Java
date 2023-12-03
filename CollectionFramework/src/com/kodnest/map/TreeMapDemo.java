package com.kodnest.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap map1 = new TreeMap<>();
		map1.put(1, 100);
		map1.put(2, 500);
		map1.put(3, 400);
		map1.put(4, 200);
		map1.put(5, 400);
		System.out.println(map1);
		
		Set keys = map1.keySet();
		System.out.println("Keys = "+keys);
		
		Set kv = map1.entrySet();
		System.out.println("Key-values = "+kv);
		
		Collection values = map1.values();
		System.out.println("Values = "+values);
	}

}
