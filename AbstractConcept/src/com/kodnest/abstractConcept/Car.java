package com.kodnest.abstractConcept;

public class Car extends Vehicle {

	@Override
	public void start() {
		System.out.println("Car is starting vrum vrum..");

	}

	@Override
	public void stop() {
		System.out.println("Car is stopping");

	}

	@Override
	public void reFuel() {
		System.out.println("Car is refuelling with deisel");

	}

}
