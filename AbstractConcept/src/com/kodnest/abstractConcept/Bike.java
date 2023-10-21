package com.kodnest.abstractConcept;

public class Bike extends Vehicle {

	@Override
	public void start() {
		System.out.println("Bike is starting brum brum");

	}

	@Override
	public void stop() {
		System.out.println("Bike is stopping");

	}

	@Override
	public void reFuel() {
		System.out.println("Bike is refuelling with petrol");

	}

}
