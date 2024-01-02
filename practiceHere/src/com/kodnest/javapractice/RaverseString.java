package com.kodnest.javapractice;
import java.util.Scanner;
public class RaverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str =new String(scan.nextLine());
		
		char[] charArr = str.toCharArray();
		for(char c: charArr) {
			System.out.print(c+" ");
		}
	}

}
