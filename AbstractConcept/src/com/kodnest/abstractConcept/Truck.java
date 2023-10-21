package com.kodnest.abstractConcept;

public class Truck extends Vehicle {

	@Override
	public void start() {
		System.out.println("Truck is starting");

	}

	@Override
	public void stop() {
		System.out.println("Truck is stopping");

	}

	@Override
	public void reFuel() {
		System.out.println("Truck is refuelling with methenol");

	}

}
