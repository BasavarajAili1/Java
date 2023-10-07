package com.kondest.polymorphism;

public class Deer extends Animal {
	public void eat() {
		System.out.println("Deer eats plants");
	}
	
	public void sleep() {
		System.out.println("Deer sleeps in dense foilage");
	}
	
	public void foodHabbit() {
		System.out.println("Deer is herbivores");
	}
}
