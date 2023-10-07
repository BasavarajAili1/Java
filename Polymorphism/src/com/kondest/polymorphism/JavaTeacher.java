package com.kondest.polymorphism;

public class JavaTeacher extends Teacher {
	public void markAttendance() {
		System.out.println("Java Teacher is marking attendance");
	}
	
	public void teach() {
		System.out.println("Java Teacher is teaching C-Language");
	}
	
	public void doLabPractice() {
		System.out.println("Java Teacher is conducting lab ");
	}
}
