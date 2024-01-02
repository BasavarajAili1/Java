package com.kodnest.abstractConcept.ClassTwo;

public class BirdApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sky sky = new Sky();
		sky.permitBirds(new GoldenEagle());
		sky.permitBirds(new SerpantEagle());
		sky.permitBirds(new MountainEagle());
		
		sky.permitBirds(new VegSparrow());
		sky.permitBirds(new NonVegSparrow());
	}

}
