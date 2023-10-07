package com.DSABootcamp.SimplePrograms;
import java.util.Scanner;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class FindSimpleInterest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Principal amount: ");
		int p = scan.nextInt();
		
		System.out.println("Enter Time in months: ");
		int t = scan.nextInt();
		
		System.out.println("Enter Rate of Interest: ");
		float r = scan.nextFloat();
		
		float simpleInterest = (p+t+r)/100;
		System.out.print("Your Simple Interest is: "+simpleInterest);
	}

}
