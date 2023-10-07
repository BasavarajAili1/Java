package com.kodnest.inheritance;

public class CarApplication {

	public static void main(String[] args) {
		Sedan sedan = new Sedan();
		sedan.regNo = 1234;
		sedan.move();
		
		Car car = new Car();
		car.regNo = 9999;
		car.move();
		
		Vehicle vehicle = new Vehicle();
		vehicle.regNo = 8055;
		vehicle.move();
	}

}
