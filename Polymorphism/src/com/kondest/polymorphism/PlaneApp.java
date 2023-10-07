package com.kondest.polymorphism;

public class PlaneApp {

	public static void main(String[] args) {
		Plane ref;
		
		ref = new FighterPlane("Vikram");
		ref.takeOff();
		
		// error bcuz parent type ref cannot access the specialized properties of child directly
//		ref.carryArms();
	
//So we can convert parent type ref to child type downcasting as show below
		
		((FighterPlane)(ref)).carryArms();
	}
}
