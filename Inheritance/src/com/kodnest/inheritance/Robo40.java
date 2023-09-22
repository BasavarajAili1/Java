package com.kodnest.inheritance;

public class Robo40 {

	public static void main(String[] args) {
		TeacherRobo teacherRobo = new TeacherRobo();
		ChefRobo chefRobo = new ChefRobo();
		DriverRobo driverRobo = new DriverRobo();
		
		teacherRobo.name = "Chitti";
		teacherRobo.type = "Humanoid";
		teacherRobo.talk();
		teacherRobo.walk();
		teacherRobo.charge();
		teacherRobo.teach();
		System.out.println();
		chefRobo.name = "Bheem";
		chefRobo.type = "Artificial";
		chefRobo.talk();
		chefRobo.walk();
		chefRobo.charge();
		chefRobo.cook();
		System.out.println();
		driverRobo.name = "Kalia";
		driverRobo.type = "Artificial";
		driverRobo.talk();
		driverRobo.walk();
		driverRobo.charge();
		driverRobo.drive();
	}
}
