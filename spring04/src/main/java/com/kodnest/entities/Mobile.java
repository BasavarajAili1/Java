package com.kodnest.entities;

public class Mobile {
	String brand;
	String RAM;
	double cost;
	public Mobile() {
		super();
	}
	public Mobile(String brand, String rAM, double cost) {
		super();
		this.brand = brand;
		RAM = rAM;
		this.cost = cost;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getRAM() {
		return RAM;
	}
	public void setRAM(String rAM) {
		RAM = rAM;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", RAM=" + RAM + ", cost=" + cost + "]";
	}
	
	
}
