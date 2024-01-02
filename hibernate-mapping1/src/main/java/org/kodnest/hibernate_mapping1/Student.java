package org.kodnest.hibernate_mapping1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

	@Id
	int id;
	String name;
	int marks;
	
	@OneToOne
	Bike bike;

	public Student(int id, String name, int marks, Bike bike) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.bike = bike;
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", bike=" + bike + "]";
	}
	
	
}
