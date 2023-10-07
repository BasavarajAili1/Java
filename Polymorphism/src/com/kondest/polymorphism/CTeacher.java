package com.kondest.polymorphism;

public class CTeacher extends Teacher {
	public void markAttendance() {
		System.out.println("C Teacher is marking attendance");
	}
	
	public void teach() {
		System.out.println("C Teacher is teaching C-Language");
	}
	
	public void doLabPractice() {
		System.out.println("C Teacher is conducting lab ");
	}
}
