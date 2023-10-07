package com.kodnest.encapsulationSample;

public class Student1 {
	private int id;
	private String name;
	private int marks;
	private String gender;
	
	// Constructor instead of setters
	public Student1(int id, String name, int marks, String gender ) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.gender = gender;
	}
	
	// Setters
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	public String getGender() {
		return gender;
	}
	
	
}
