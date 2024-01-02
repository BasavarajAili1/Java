package com.DSABootcamp.SimplePrograms;
import java.util.Scanner;

// Take 2 numbers as input and print the largest number.
public class FindLargestNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your two numbers: ");
		int firstNum = scan.nextInt();
		int secNum = scan.nextInt();
		
		if(firstNum > secNum) {
			System.out.println("Largest number is "+firstNum);
		}
		else if(secNum > firstNum) {
			System.out.println("Largest number is "+secNum);
		}
		else {
			System.out.println("Both numbers are equal");
		}

	}

}
