package com.kodnest.stringprograms.level1;
import java.util.Scanner;

public class LengthChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=new String(scan.next());
		System.out.println("Enter second string");
		String s2=new String(scan.next());
		lengthChecker(s1,s2);

	}
	public static void lengthChecker(String s1, String s2) {
		if(s1.length()==s2.length()) {
			System.out.println("Both strings are of same length");
		}
		else {
			System.out.println("Both strings are of different length");
		}
	}

}
