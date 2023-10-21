package com.kodnest.abstractConcept;

public class VehicleApp {

	public static void main(String[] args) {
		ShowRoom sh = new ShowRoom();
		
		sh.acceptVehicle(new Car());
		System.out.println("________________________________");
		
		sh.acceptVehicle(new Bike());
		System.out.println("________________________________");
		
		sh.acceptVehicle(new Truck());
		System.out.println("________________________________");

	}
}
