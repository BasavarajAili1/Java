package com.kodnest.stringprograms.level2;
import java.util.Scanner;

public class UpperLowerCounterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String str=new String(scan.nextLine());
		System.out.println(str);
		UpperLowerCounter countUpperlower=new UpperLowerCounter();
		countUpperlower.countUpperLower(str);
	}
}
