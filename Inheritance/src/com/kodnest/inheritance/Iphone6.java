package com.kodnest.inheritance;

public class Iphone6 extends Iphone {
	@Override
	public void design() {
		System.out.println("Iphone 6 has rectangular design with curvy edges");
	}
	
	// Specialized method
	public void unlockUsingFingerprint() {
		System.out.println("Welcome! You unlocked using fingerprint");
	}
}
