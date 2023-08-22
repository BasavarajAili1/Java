package com.kodnest.arrays;

import java.util.Scanner;
public class Solution9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an number to calculate its Factorial!");
		int num=scan.nextInt();

		int factorial=findFactorial(num);
		System.out.println("Factorial is--> "+factorial);

	}
	public static int findFactorial(int num) {
		int fact=1;
		for (int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
