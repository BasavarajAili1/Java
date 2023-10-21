package com.kodnest.abstractConcept;

public abstract class VegSparrow extends Sparrow {
	@Override
	public void fly() {
		System.out.println("Veg Sparrow is flying");
	}
	
	void eat() {
		System.out.println("Veg sparrow is eating grains");
	}
	
}
