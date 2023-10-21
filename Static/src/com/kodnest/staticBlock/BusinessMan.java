package com.kodnest.staticBlock;

import java.util.Scanner;

public class BusinessMan {
	String name;
	int p;
	int t;
	static float r;
	float si;
	
	static {
		r = 2.0f;
	}
	
	public void takeInput(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter P for businessman "+name);
		p = scan.nextInt();
		System.out.println("Enter T for businessman "+name);
		t = scan.nextInt();
	}
	
	public void calculateSI() {
		si = (p * t * r) / 100;
	}
	
	public void display() {
		System.out.println("Simple Interest is: "+si);
	}
	
	public BusinessMan(String name) {
		this.name = name;
	}
}
