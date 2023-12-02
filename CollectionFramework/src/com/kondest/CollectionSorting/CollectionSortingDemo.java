package com.kondest.CollectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class CollectionSortingDemo {

	public static void main(String[] args) {
		// Two ways
		//1. By using TreeSet
		TreeSet<Integer> set = new TreeSet();
		set.add(20);
		set.add(1);
		set.add(500);
		set.add(45);
		System.out.println("Sorting using TreeSet: "+set);
		
		//2. By using Collections.sort(obj)
		ArrayList<Integer> list = new ArrayList();
		list.add(500);
		list.add(50);
		list.add(350);
		list.add(44);
		System.out.println("List before sorting-> "+list);
		Collections.sort(list);
		System.out.println("List after sorting-> "+list);

	}

}
