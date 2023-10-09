package com.kodnest.hasARealation;

public class Student {
	// Handling composition
	Brain brain = new Brain("White", 900);
	
	// Handling Aggregation
	Book ref;
	public void hasA(Book ref) {
		this.ref = ref;
		System.out.println(ref.getName());
		System.out.println(ref.getAuthor());
		System.out.println(ref.getPrice());
	}
}
