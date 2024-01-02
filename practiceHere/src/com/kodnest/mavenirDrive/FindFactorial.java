package com.kodnest.mavenirDrive;
import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		long fact=calculateFactorial(num);
		System.out.println("Factorial of "+num+" is "+fact);
	}
	
	public static long calculateFactorial(int num) {
		long factorial=1;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		return factorial;
	}
}
