package com.kondest.polymorphism;

public class Institute {
	public void acceptTeacher(Teacher ref) {
		ref.markAttendance();
		ref.teach();
		ref.doLabPractice();
	}
}
