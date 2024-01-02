package com.kodnest.practice28thOct;

import java.util.Scanner;
//Q6
public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String input = scan.nextLine();
		System.out.println("Reversed string is: "+reverseString(input));
		
	}
	public static String reverseString(String str) {
		char[] stringArray = str.toCharArray();
		char[] revStringArray = new char[stringArray.length];
		
		int j = revStringArray.length-1;
		for(int i=0;i<=stringArray.length-1;i++) {
			revStringArray[j] = stringArray[i];
			j--;
		}
		return new String(revStringArray);
	}
}
