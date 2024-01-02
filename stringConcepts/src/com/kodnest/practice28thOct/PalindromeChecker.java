package com.kodnest.practice28thOct;

import java.util.Scanner;
//Q7
public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String input = scan.nextLine();
		boolean result = checkPalindrome(input);
		if(result) {
			System.out.println("Given string is palindrome");
		}
		else {
			System.out.println("Given string is not palindrome");
		}

	}
	public static boolean checkPalindrome(String str) {
		char[] arr = str.toCharArray();
		char[] revArr = new char[arr.length];
		
		int j = revArr.length-1;
		for(int i=0;i<=arr.length-1;i++) {
			revArr[j] = arr[i];
			j--;
		}
		
		if(new String(revArr).equals(str)) {
			return true;
		}
		else {
			return false;
		}
	}
}
