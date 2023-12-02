package com.kodnest.wrapperClasses;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class BackwardTraversing {

	public static void main(String[] args) {
		System.out.println("------Backward traversing for Queue Interface Example------");
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		
		// Using descending iterator
		Iterator itr = ad.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		
		// Backward traversing for List
		System.out.println("------Backward traversing for List Interface Example------");
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(500);
		list1.add(400);
		list1.add(100);
		list1.add(000);
		
		ListIterator itr2 =  list1.listIterator(list1.size());
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
	}

}
