package com.kodnest.friendlypair;

import java.util.Scanner;

public class FriendlyPair {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		int sum1 = getDivisorsSum (num1);
		int sum2 = getDivisorsSum (num2);

		if (sum1==num2 && sum2==num1) {
			System.out.println (num1 + " and " + num2 + " are friendly pair numbers.");
		}
			
		else {
			System.out.println (num1 + " and " + num2 + " are not friendly pair numbers.");
		}
		scanner.close();
	}

	static int getDivisorsSum (int n)
	{
		int sum = 0;
		for(int i = 1; i < n; i++) 
		{ 
			if (n % i == 0) 
			{ 
				sum = sum + i; 
			} 	
		}
		return sum; 
	}

}
