package org.kodnest.hibernate_crud1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {

	@Id
	int laptopId;
	String brandName;
	double price;
	public Laptop(int laptopId, String brandName, double price) {
		super();
		this.laptopId = laptopId;
		this.brandName = brandName;
		this.price = price;
	}
	public Laptop() {
		super();
	}
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", brandName=" + brandName + ", price=" + price + "]";
	}
	
	
}
