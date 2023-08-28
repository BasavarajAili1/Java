package com.kodnest.stringprograms.level2;
import java.util.Scanner;

public class UpperToLowerConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String str=new String(scan.nextLine());
		System.out.println("Lower Case: "+convertUpperToLower(str));
	}
	static String convertUpperToLower(String str) {
		return str.toLowerCase();
	}
}
