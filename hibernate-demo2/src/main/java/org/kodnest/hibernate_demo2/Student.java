package org.kodnest.hibernate_demo2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Alt+shift+s --> o : To generate constructor
//Alt+shift+s --> r : To generate setters & getters (accessors)
//Alt+shift+s --> s : To generate toString()

@Entity
@Table(name="students")
public class Student {
	
	@Id
	int id;
	String name;
	int marks;
	public Student() {
		super();
	}
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
