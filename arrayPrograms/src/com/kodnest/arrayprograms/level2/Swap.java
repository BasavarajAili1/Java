package com.kodnest.arrayprograms.level2;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		/*Instantiate Scanner object
		Tell user to enter 2 Nums
		accept 2 numbers and store
		print nums before swapping
		swapping logic
		Print numbers after swapping
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 Numbers to Swap");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.print("Before Swapping: "+a+" "+b);
		System.out.println();
		int c=a;//c----->Helping memory location
		a=b;
		b=c;
		System.out.println("After Swapping: "+a+" "+b);
	}
}
