package com.kodnest.inheritance;

public class HumanDriverApp {

	public static void main(String[] args) {
		Driver d = new Driver("Driving with gear card", "Female");
		System.out.println(d.name+" "+d.age+" "+d.skill+" "+d.gender);
		
	}

}
