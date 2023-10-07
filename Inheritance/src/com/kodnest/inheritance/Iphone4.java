package com.kodnest.inheritance;

public class Iphone4 extends Iphone {
	@Override
	public void design() {
		System.out.println("Iphone 4 has Rectangular Design");
	}
	
	// Specialized method
	public void playing() {
		System.out.println("Iphone 4 is playing a song..");
	}
}
