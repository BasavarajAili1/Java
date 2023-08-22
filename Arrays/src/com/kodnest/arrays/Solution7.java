package com.kodnest.arrays;

import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter "+arr.length+" elements of array:");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		int product=productOfArray(arr);
		System.out.println("Product of array: "+product);

	}
	public static int productOfArray(int arr[]) {
		int product=1;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			product=arr[i]*product;
		}
		return product;
	}
}
