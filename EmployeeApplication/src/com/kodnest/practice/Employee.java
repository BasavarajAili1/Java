package com.kodnest.practice;

public class Employee {
	private int id;
	private String name;
	private double salary;
	static int idgenerator = 1000;
	
	
	public Employee(String name, double salary) {

		this.id = ++idgenerator;
		this.name = name;
		this.salary = salary;
	}
	public void setID(int id) {
		this.id = id;
	}
	public int getID() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}

}
