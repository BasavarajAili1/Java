package com.kodnest.hasARealation;

public class Charger {
	String brand;
	String color;
	String type;
	
	public Charger(String brand, String color, String type) {
		this.brand = brand;
		this.color = color;
		this.type = type;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getType() {
		return type;
	}
}
