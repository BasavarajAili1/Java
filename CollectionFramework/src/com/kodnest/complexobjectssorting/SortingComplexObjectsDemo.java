package com.kodnest.complexobjectssorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingComplexObjectsDemo {

	public static void main(String[] args) {
		Student s1 = new Student(11, "ABC", 73);
		Student s2 = new Student(12, "PQR", 50);
		Student s3 = new Student(10, "XYZ", 48);
		
		ArrayList<Student> list1 = new ArrayList<Student>();
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		
		System.out.println("Befoe sorting--->");
		System.out.println(list1);
		System.out.println("After sorting--->");
		SortStudentsById s = new SortStudentsById();
//		Collections.sort(list1,s);
		// Or by using Anonymous method
		Collections.sort(list1, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if(s1.id > s2.id) {
					return 1;
				}else if(s1.id < s2.id) {
					return -1;
				}else {
					return 0;
				}
			}
		});
		System.out.println(list1);
		
	}

}
