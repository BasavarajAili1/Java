package com.kodnest.encapsulationSample;

public class TemperatureApp {

	public static void main(String[] args) {
		
		Classroom classroom = new Classroom();
		
		// Below line will give error bcuz temp is private in classroom class
//		classroom.temp = 280;
		
		classroom.setTemperature(28);
		System.out.println(classroom.getTemperature());
	}

}
