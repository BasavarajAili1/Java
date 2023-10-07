package com.kondest.polymorphism;

public class FighterPlane extends Plane {
	public FighterPlane(String name) {
		this.name = name;
	}
	
	public void fly() {
		System.out.println(name+" plane is flying very fast");
	}
	
	// specialized property
	public void carryArms() {
		System.out.println(name+" is carying arms as weapons");
	}
}
