package com.kodnest.commandline.arguments;

public class AreaOfCircle {

	public static void main(String[] args) {
		System.out.println("Radius: "+args[0]);
		
		double r=Double.parseDouble(args[0]);
		
		double area=3.14*r*r;
		
		System.out.println("Area of circle: "+area);

	}

}
