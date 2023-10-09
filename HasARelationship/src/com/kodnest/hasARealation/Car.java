package com.kodnest.hasARealation;

public class Car {
	String brand;
	String color;
	int cost;
	public Car(String brand, String color, int cost) {
		super();
		this.brand = brand;
		this.color = color;
		this.cost = cost;
	}
	
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public int getCost() {
		return cost;
	}
	
	//Handling compositions
	Engine engine = new Engine("Diesel Engine", 1700);
}
