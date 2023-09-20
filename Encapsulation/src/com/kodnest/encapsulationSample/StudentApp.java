package com.kodnest.encapsulationSample;

public class StudentApp {

	public static void main(String[] args) {
		Student student = new Student();
//		student.id = 101;// Error because id is private
		
		//Setters
		student.setId(1);
		student.setName("Raju");
		student.setMarks(99);
		student.setGender("Male");
		
		//Getters
		System.out.println(student.getId()+" "+student.getName()+" "+student.getMarks()+" "+student.getGender());
	}

}
