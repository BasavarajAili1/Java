package com.kodnest.arrayprograms.level3;

import java.util.Scanner;

public class Question1Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter lenght of Array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements of Array..");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}

		System.out.println("Enter Target to search");
		int target=scan.nextInt();
		
		Search search=new Search();
		boolean res=search.isPresent(arr, target);
		if(res==true) {
			System.out.println("Target is found in the Array");
		}
		else {
			System.out.println("Target not found");
		}

	}

}
