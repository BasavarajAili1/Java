package com.kodnest.interfaceInJava;

import java.util.Scanner;

public class MyCalculator3 implements Calculator {
	Scanner scan = new Scanner(System.in);
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a == 0 || b == 0) {
			System.out.println("Idiot..for this you need calculator?");
		}
		int c = a + b;
		System.out.println(c);
	}	

	@Override
	public void subtraction() {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (b == 0) {
			System.out.println("Idiot..for this you need calculator?");
		}
		int c = a - b;
		System.out.println(c);
	}

	@Override
	public void multi() {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a == 0 || b == 0) {
			System.out.println("Idiot..for this you need calculator?");
		}
		int c = a * b;
		System.out.println(c);
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (b == 0) {
			System.out.println("Idiot..Who thought you math?. Any number can't divide by 0");
		}
		int c = a / b;
		System.out.println(c);
		
	}

}
