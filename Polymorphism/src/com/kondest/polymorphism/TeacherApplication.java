package com.kondest.polymorphism;

public class TeacherApplication {
	public static void main(String[] args) {
		Institute i =new Institute();
		
		i.acceptTeacher(new CTeacher());
		i.acceptTeacher(new JavaTeacher());
		i.acceptTeacher(new PythonTeacher());
	}	
}