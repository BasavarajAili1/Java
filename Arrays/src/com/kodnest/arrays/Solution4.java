package com.kodnest.arrays;

import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter "+arr.length+" elements of array:");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		int count=countEvenNumbers(arr);
		System.out.println("Count of Even numbers in given array: "+count);
	}
	
	public static int countEvenNumbers(int arr[]) {
		int count=0;
		for (int i : arr) {
			if (i%2==0)
			{
				count++;
			}
		}
		return count;
	}
}
