package com.kodnest.stringprograms.level1;
import java.util.Scanner;

public class PalindromeCheckerApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an string to check palindrome: ");
		String s1=new String(scan.next());
		
		System.out.print("String before reversing--> ");
		System.out.print(s1);
		System.out.println();
		boolean res=isPalindrome(s1);
		if(res==true) {
			System.out.println("Yes! the entered string is Palindrome");
		}
		else {
			System.out.println("No! the entered string is not Palindrome");
		}

	}
	public static boolean isPalindrome(String s1) {
		char arr1[]=s1.toCharArray();
		char arr2[]=new char[arr1.length];
		
		int j=arr2.length-1;
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[j]=arr1[i];
			j--;
		}
		
		String s2=new String(arr2);
		
		System.out.println("String after reversing--> "+s2);
		if(s1.equals(s2))
		{
			return true;
		}
		else {
			return false;
		}
	}
}
