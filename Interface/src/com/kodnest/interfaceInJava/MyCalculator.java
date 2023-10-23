package com.kodnest.interfaceInJava;

public class MyCalculator implements Calculator {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 10;
		int c = a + b;
		System.out.println(c);
		
	}

	@Override
	public void subtraction() {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 10;
		int c = a - b;
		System.out.println(c);
		
	}

	@Override
	public void multi() {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 10;
		int c = a * b;
		System.out.println(c);
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 10;
		int c = a / b;
		System.out.println(c);
		
	}

}
