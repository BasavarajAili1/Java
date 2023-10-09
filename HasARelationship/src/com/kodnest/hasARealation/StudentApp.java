package com.kodnest.hasARealation;

public class StudentApp {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.brain.color);
		System.out.println(student.brain.weight);
		
		Book b = new Book("Let Us C", "Yashvanth", 1000);
		student.hasA(b);
		System.out.println();
		
		// assume student object destroyed
		student = null;
		System.out.println("Student object destroyed..");
		System.out.println("Now we can't access composition object but can access aggregation object");
		// now we can't access composition object 
//		System.out.println(student.brain.color);
		
		//but can access aggregation object
		System.out.println(b.getName());
		System.out.println(b.getAuthor());
		System.out.println(b.getPrice());
	}
}
