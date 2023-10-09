package com.kodnest.hasARealation;

public class Mobile {
	//Handling composition
	OS os = new OS(32, "Android");
	
	//Handling Aggregation
	Charger ref;
	public void hasA(Charger ref) {
		this.ref = ref;
		System.out.println(ref.getBrand());
		System.out.println(ref.getColor());
		System.out.println(ref.getType());
	}
}
