package com.kodnest.collectionFramework1;

import java.util.PriorityQueue;

public class CollectionsPriorityQueue {

	public static void main(String[] args) {

		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add("Two");
		pq.add("Twenty");
		pq.add("Thirty");
	//	pq.add(10); Generate Compile time error due to type safety
		
		PriorityQueue<Integer> p2 = new PriorityQueue<Integer>();
		p2.add(10);
		p2.add(20);
		p2.add(5);
		p2.add(50);
	//	p2.add("Ten"); Generate Compile time error due to type safety
		
		System.out.println(pq);
		System.out.println(p2);
	}

}
