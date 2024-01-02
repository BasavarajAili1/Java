package com.kodnest.Synchronized;

public class Hospital {

	public static void main(String[] args) {
		Treatments treat = new Treatments(new Hospital());
		
		Thread t1 = new Thread(treat);
		Thread t2 = new Thread(treat);
		
		t1.setName("Tom");
		t2.setName("Jerry");
		t1.start();
		t2.start();

	}

}
