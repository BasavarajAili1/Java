package com.kodnest.arrayprograms.level4;

import java.util.Scanner;

public class Question2Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter lenght of Array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements of Array..");
		
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.print("Array elements are===> ");
		for(int x: arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		SumOfArrayElementsApp sum= new SumOfArrayElementsApp();
		int res=sum.sumOfArray(arr);
		System.out.println("Sum of Array elements is: "+res);
	
	}

}
