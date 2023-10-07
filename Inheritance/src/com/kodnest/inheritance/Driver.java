package com.kodnest.inheritance;

public class Driver extends Human {
	String skill;
	String gender;
	
	public Driver() {
		super("Sharath", 30, 6.0f);
	}
	
	public Driver(String skill) {
		this();
		this.skill = skill;
	}
	
	public Driver(String skill, String gender) {
		this("Driving without gear card");
		this.skill = skill;
		this.gender = gender;
	}
}
