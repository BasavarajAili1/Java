package com.kodnest.wrapperClasses;
import java.util.ArrayList;
import java.util.Iterator;
public class TraverseInCollectionWrapperClasses {

	public static void main(String[] args) {
		ArrayList<Object> list1 = new ArrayList<Object>();
		list1.add("Shirt");
		list1.add("Jeans");
		list1.add("Cap");
		list1.add(10);
		list1.add(true);
		
		// 1. Using for loop
		System.out.println("-----------1. Using for loop");
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		// 2. Using for-each loop
		System.out.println("-----------2. Using for-each loop");
		for(Object s: list1) {
			System.out.println(s);
		}
		
		// 3. Using Iterator
		System.out.println("-----------3. Using Iterator");
		Iterator<Object> itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
