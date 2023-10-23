package com.kodnest.interfaceInJava;

public class LaunchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casio casio = new Casio();
		casio.acceptCalculator(new MyCalculator());
		casio.acceptCalculator(new MyCalculator2());
		casio.acceptCalculator(new MyCalculator3());
	}

}
