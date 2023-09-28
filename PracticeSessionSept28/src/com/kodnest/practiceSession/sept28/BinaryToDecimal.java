package com.kodnest.practiceSession.sept28;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int num = 11010;
		
		int i = 0;
		int sum = 0;
		
		while (num > 0) {
			int rem = num % 10; //Take out the last digit
			sum = sum + rem * (int) Math.pow(2, i);
			i++;
			num = num/10; // remove the last digit
		}
		System.out.println(sum);

	}
}
