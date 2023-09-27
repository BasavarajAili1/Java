package com.kodnest.weeklyTest;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String teamName;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
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
	
	public void setTeamName() {
		if(id>=1 && id<=50) {
			this.teamName = "Team-A";
		}
		else if(id>=51 && id<=100) {
			this.teamName = "Team-B";
		}
		
	}
	public String getTeamName() {
		return teamName;
	}
}
