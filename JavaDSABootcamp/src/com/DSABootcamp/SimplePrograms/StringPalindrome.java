package com.DSABootcamp.SimplePrograms;
import java.util.Scanner;
public class StringPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your string: ");
		String s = scan.next();
		
		char[] sChar = s.toCharArray();
		char[] revChar = new char[sChar.length];
		
		int j = sChar.length-1;
		for (int i=0; i<=revChar.length-1; i++) {
			
			revChar[i] = sChar[j];
			j--;
		}
		
		String revString = new String(revChar);
		System.out.println(revString);
		if(s.equals(revString)) {
			System.out.println("Palindrome -> True");
		}
		else {
			System.out.println("Palindrome -> False");
		}
	}
}
