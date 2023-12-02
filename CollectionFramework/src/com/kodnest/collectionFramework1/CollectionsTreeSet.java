package com.kodnest.collectionFramework1;

import java.util.*;
public class CollectionsTreeSet {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
		set.add(10);
//		set.add(20.5); Heterogeneous Data not allowed
		set.add(20);
		set.add(30);
		set.add(40);
		
		set.add(20);
		set.add(20); // Duplicates are not allowed
		
		System.out.println(set);

	}

}
