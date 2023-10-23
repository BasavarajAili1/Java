package com.kodnest.interfaceInJava;

import java.util.Scanner;

public class MyCalculator2 implements Calculator {
	Scanner scan = new Scanner(System.in);
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 Numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a + b;
		System.out.println(c);
		
	}

	@Override
	public void subtraction() {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 Numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a - b;
		System.out.println(c);
		
	}

	@Override
	public void multi() {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 Numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a * b;
		System.out.println(c);
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 Numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a / b;
		System.out.println(c);
	}

}
