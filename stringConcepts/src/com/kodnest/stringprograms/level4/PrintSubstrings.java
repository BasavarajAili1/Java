package com.kodnest.stringprograms.level4;

import java.util.Scanner;

public class PrintSubstrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=new String(scan.nextLine());
		
		for(int i=0;i<=s1.length()-1;i++) {
			String temp="";
			for(int j=i;j<=s1.length()-1;j++) {
				temp=temp+s1.charAt(j);
				System.out.print(temp+", ");
			}
		}
	}
}
