package com.kodnest.practice28thOct;

import java.util.Scanner;
//Q5
public class DisplayAllSubstrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String input = scan.nextLine();
		displayAllSubstrings(input);

	}
	public static void displayAllSubstrings(String str) {
		
//		for(int i=0;i<=str.length()-1;i++) {
//			String temp = "";
//			for(int j=i;j<=str.length()-1;j++) {
//				temp = temp+str.charAt(j);
//				System.out.println(temp);
//			}
//		}
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String substring = str.substring(i, j);
				System.out.println(substring);
			}
		}
	}
}
