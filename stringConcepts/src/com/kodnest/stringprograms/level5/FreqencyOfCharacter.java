package com.kodnest.stringprograms.level5;

import java.util.Scanner;

public class FreqencyOfCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=new String(scan.nextLine());
		char arr[]=s1.toCharArray();
		String s="";
		
		for(int i=0;i<=arr.length-1;i++) {
			int count=0;
			if(!s.contains(String.valueOf(s1.charAt(i)))) {
			for(int j=i;j<=arr.length-1;j++) {
				if(arr[j]==s1.charAt(i)) {
					count++;
				}
			}
			System.out.println(s1.charAt(i)+"--> "+count);
			s=s+s1.charAt(i);
			}
		}
	}
}
