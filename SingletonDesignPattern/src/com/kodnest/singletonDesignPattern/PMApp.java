package com.kodnest.singletonDesignPattern;

public class PMApp {

	public static void main(String[] args) {
		//Error because private constructor
//		PrimeMinister pm1 = new PrimeMinister();
//		PrimeMinister pm2 = new PrimeMinister();
		
		PrimeMinister pm1 = PrimeMinister.getInstance();
		PrimeMinister pm2 = PrimeMinister.getInstance();
		System.out.println(pm1);
		System.out.println(pm2);

	}
}
