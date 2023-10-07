package com.kodnest.inheritance;

public class IphoneApplication {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.os(); 
		iphone.design(); 
		System.out.println();
		
		Iphone4 iphone4 = new Iphone4();
		iphone4.os();// Inherited
		iphone4.design();// Override
		iphone4.playing();
		System.out.println();
		
		Iphone6 iphone6 = new Iphone6();
		iphone6.os();
		iphone6.design();
		iphone6.unlockUsingFingerprint();
		System.out.println();
		
		Iphone14 iphone14 = new Iphone14();
		iphone14.os();
		iphone14.design();
		iphone14.unlockUsingFace();
	}

}
