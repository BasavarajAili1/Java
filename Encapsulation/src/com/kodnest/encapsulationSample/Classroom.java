package com.kodnest.encapsulationSample;

public class Classroom {
	private int temp;
	//Setter
	public void setTemperature(int x) {
		if ( x > 10 && x < 35) {
			temp = x;
		}
		else {
			System.out.println("Invalid Temperature");
		}
	}
	
	//Getter
	public int getTemperature(){
		return temp;
	}
	
}
