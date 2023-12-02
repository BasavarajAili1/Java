package com.kodnest.collectionFramework1;

import java.util.LinkedList;

public class CollectionsLinkedList {

	public static void main(String[] args) {
		
		LinkedList list1 = new LinkedList();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		list1.add(1,11);
		list1.set(1,22);
		list1.add(10);
		
		System.out.println("List:"+list1);
		System.out.println("Element at index 2: "+list1.get(2));
		System.out.println("Index of 10: "+list1.indexOf(10));
		System.out.println("Last Index of 10: "+list1.lastIndexOf(10));
		System.out.println();
		
		LinkedList list2 = new LinkedList();
		list2.add("Ten");
		list2.add("Twenty");
		list2.add("Thirty");
		
		list2.addAll(list1);
		System.out.println(list2);

	}

}
