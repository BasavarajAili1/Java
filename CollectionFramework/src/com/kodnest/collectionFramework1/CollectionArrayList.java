package com.kodnest.collectionFramework1;

import java.util.*;

public class CollectionArrayList {

	public static void main(String[] args) {
		
//		ArrayList list1 = new ArrayList();
//		list1.add(100);
//		list1.add(10.50);
//		list1.add(true);
//		list1.add('a');
//		list1.add(10);
//		list1.add(20);
//		list1.add(30);
//		list1.add(40);
//		list1.add(40);
//		list1.add(111);
//		
//		System.out.println(list1);
//		System.out.println("Now Size of list1: "+list1.size());
//		System.out.println("Get the Data at index 9: "+list1.get(9));
//		
//		list1.add(9, 10); // inserting the data 10 at index 9
//		System.out.println("inserting the data 10 at index 9: "+list1);
//		System.out.println("First index of 10: "+list1.indexOf(10));
//		System.out.println("Last index of 10: "+list1.lastIndexOf(10));
		
		
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		ArrayList list2 = new ArrayList();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		list2.add("Five");
		
		list2.addAll(list1); // Add all elements of specified collection at the end of list2
		System.out.println(list2);
		
		list2.addAll(2, list1);// Add all elements of specified collection at the specified index of list2
		System.out.println(list2);
		

		
	}

}
