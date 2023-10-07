package com.kondest.polymorphism;

public class AnimalApplication {

	public static void main(String[] args) {
		AnimalPlanet animalPlanet = new AnimalPlanet();
		
		animalPlanet.acceptAnimal(new Tiger());
		animalPlanet.acceptAnimal(new Deer());
		animalPlanet.acceptAnimal(new Monkey());
	}
}
