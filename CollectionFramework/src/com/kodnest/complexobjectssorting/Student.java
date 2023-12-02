package com.kodnest.complexobjectssorting;

public class Student {
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student[id= "+id+", name= "+name+", marks= "+marks+"]";
	}
//	@Override
//	public int compareTo(Student s) {
//		if (this.id > s.id) {
//			return 1;  
//		}
//		else if (this.id < s.id) {
//			return -1;
//		}
//		else{
//			return 0;
//		}
//	}
	
	
}
