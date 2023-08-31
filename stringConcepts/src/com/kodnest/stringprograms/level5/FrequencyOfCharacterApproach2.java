package com.kodnest.stringprograms.level5;

import java.util.Scanner;

public class FrequencyOfCharacterApproach2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=new String(scan.nextLine());
		
		char arr[]=s1.toCharArray();
		
		for(int i=0;i<=arr.length-1;i++) {
			int count=0;
			if(arr[i]!=' ') {
				count++;
				for(int j=i+1;j<=arr.length-1;j++) {
					if(arr[i]==arr[j]) {
						count++;
						arr[j]=' ';
					}
				}
				System.out.println(arr[i]+"--> "+count);
			}
		}

	}

}
