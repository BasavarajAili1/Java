package com.kodnest.inheritance;

public class Iphone14 extends Iphone {
	@Override
	public void design() {
		System.out.println("Iphone 14 has rectangular design without curvy edges");
	}
	
	// Specialized method
	public void unlockUsingFace() {
		System.out.println("Welcome! You unlocked using face unlock");
	}
}
