package com.kodnest.entities;

public class University {
	String id;
	String name;
	Trainer trainer;
	public University() {
		super();
	}
	public University(String id, String name, Trainer trainer) {
		super();
		this.id = id;
		this.name = name;
		this.trainer = trainer;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", trainer=" + trainer + "]";
	}
	
	
	
	
}
