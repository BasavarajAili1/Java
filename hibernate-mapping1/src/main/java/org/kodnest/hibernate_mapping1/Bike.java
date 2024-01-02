package org.kodnest.hibernate_mapping1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Bike {
	
	@Id
	int regNumber;
	String model;
	double price;
	
	@OneToOne
	Student student;
	
	public Bike() {
		super();
	}

	public int getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Bike [regNumber=" + regNumber + ", model=" + model + ", price=" + price + ", student=" + student + "]";
	}
	
	
	
	
}
