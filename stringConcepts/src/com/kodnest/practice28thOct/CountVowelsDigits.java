package com.kodnest.practice28thOct;

import java.util.Scanner;

public class CountVowelsDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String input = scan.nextLine();
		char[] arr = input.toCharArray();
		identifyChar(input);



	}
	public static void identifyChar(String str) {
		char[] arr = str.toCharArray();
		int vowels=0, consonants=0, digits=0, specialChar=0;
		
		for(char ch: arr) {
			if(Character.isDigit(ch)) {
				digits++;
			}
			else if (Character.isAlphabetic(ch)) {
				if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U') {
					vowels++;
				}
				else {
					consonants++;
				}
			}
			else {
				specialChar++;
			}
		}
		System.out.println("Vowels: "+vowels);
		System.out.println("Consonants: "+consonants);
		System.out.println("Digits: "+digits);
		System.out.println("Special Characters: "+specialChar);
		
	}

}
