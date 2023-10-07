package com.kondest.polymorphism;

public class PythonTeacher extends Teacher {
	public void markAttendance() {
		System.out.println("Python Teacher is marking attendance");
	}
	
	public void teach() {
		System.out.println("Python Teacher is teaching C-Language");
	}
	
	public void doLabPractice() {
		System.out.println("Python Teacher is conducting lab ");
	}
}
