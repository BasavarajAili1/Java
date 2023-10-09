package com.kodnest.hasARealation;

public class StudentApplication {

	public static void main(String[] args) {
		Students student = new Students();
		System.out.println(student.heart.color);
		System.out.println(student.heart.weight);
		System.out.println();
		
		System.out.println(student.brain.color);
		System.out.println(student.brain.weight);
		System.out.println();
		
		Books b = new Books("Let Us C", "Yashvanth", 1200);
		student.hasA(b);
		System.out.println();
		
		Car c = new Car("BMW", "Black", 3000000);
		student.hasA(c);
		System.out.println();
		
		System.out.println(c.engine.getType());
		System.out.println(c.engine.getBHP());
		System.out.println();
		
		// assume car object destroyed
		c = null;
		System.out.println("Car object got destroyed");
		System.out.println();
		// now we can't access the engine object and its properties so below line rises an exception
//		System.out.println(c.engine.getBHP());
		
		// assume student object got destroyed
		student = null;
		System.out.println("Student object is destroyed");
		// now we can't access the engine object and its properties so below line rises an exception
//		System.out.println(student.heart.color);
		
		// but we can access book coz aggregation
		System.out.println(b.getName());
		System.out.println(b.getAuthor());
		System.out.println(b.getPrice());
	}
}
