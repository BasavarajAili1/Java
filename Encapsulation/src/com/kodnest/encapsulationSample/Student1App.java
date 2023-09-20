package com.kodnest.encapsulationSample;

public class Student1App {

	public static void main(String[] args) {
		Student1 s1 = new Student1(1, "Raju", 99, "Male");
		
		System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getMarks()+" "+s1.getGender());

	}

}
