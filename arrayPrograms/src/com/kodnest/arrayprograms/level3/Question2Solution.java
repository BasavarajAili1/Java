package com.kodnest.arrayprograms.level3;

import java.util.Scanner;

public class Question2Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter lenght of Array");
		int arr1[]=new int[scan.nextInt()];
		int arr2[]=new int[arr1.length];
		System.out.println("Enter "+arr1.length+" elements of Array..");
		
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
		}
		
		System.out.print("Elements of 1st Array===> ");
		for(int x: arr1) {
			System.out.print(x+" ");
		}
		System.out.println();

		for(int i=0;i<=arr1.length-1;i++) {
			arr2[i]=arr1[i];
		}
		
		System.out.print("Elements of 2nd Array===> ");
		for(int x: arr2) {
			System.out.print(x+" ");
		}
	}

}
