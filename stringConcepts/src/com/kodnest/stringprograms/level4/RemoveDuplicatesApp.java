package com.kodnest.stringprograms.level4;
import java.util.Scanner;

public class RemoveDuplicatesApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=new String(scan.nextLine());
		RemoveDuplicates rd=new RemoveDuplicates();
		String s2=rd.remove(s1);
		System.out.println(s2);

	}
}
