package com.kodnest.stringprograms.level1;
import java.util.Scanner;

public class ReturnConcatination {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=new String(scan.next());
		System.out.println("Enter second string");
		String s2=new String(scan.next());
		String concat=concatinate(s1, s2);
		if(concat!=null) {
			System.out.println(concat);
		}
		else {
			System.out.println("Both the String values are not same!");
		}

	}
	public static String concatinate(String s1, String s2) {
		if(s1.equals(s2))
		{
			return s1.concat(s2);
		}
		return null;
	}

}
