package com.kodnest.stringprograms.level5;

import java.util.Scanner;

public class CheckAnagramApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 strings");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		if(s1.length()==s2.length()) {
			CheckAnagram checkAnagram = new CheckAnagram();
			if(checkAnagram.isAnagram(s1, s2)==true) {
				System.out.println("Anagrams");
			}
			else {
				System.out.println("Not Anagrams");
			}
		}
		else {
			System.out.println("Not Anagrams");
		}
	}
}
