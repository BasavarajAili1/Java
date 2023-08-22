package com.kodnest.arrays;

import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an length of array");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter "+arr.length+" elements of array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		int count=countOddNumbers(arr);
		System.out.println("Count of odd numbers in array -> "+count);

	}
	public static int countOddNumbers(int[] arr) {
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if (arr[i]%2!=0)
			{
				count++;
			}
		}
		return count;
	}
}
