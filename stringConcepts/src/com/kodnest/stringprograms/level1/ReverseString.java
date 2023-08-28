package com.kodnest.stringprograms.level1;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to reverse: ");
		String s1=new String(scan.next());
		System.out.print("String before reversing--> ");
		System.out.print(s1);
		System.out.println();

		char arr1[]=s1.toCharArray();
		char arr2[]=new char[arr1.length];

		int j=arr2.length-1;
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[j]=arr1[i];
			j--;
		}

		s1=new String(arr2);
		System.out.print("Reversed String--> ");
		System.out.print(s1);
	}
}
