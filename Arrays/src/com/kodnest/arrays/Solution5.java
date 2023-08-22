package com.kodnest.arrays;

import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an length of array of tracsaction amount: ");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter "+arr.length+" transaction amounts");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		int sum = sumOfPosTransactions(arr);
		System.out.println("Total income from positive trasactions-> "+sum);
	}
	public static int sumOfPosTransactions(int[] arr) {
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if (arr[i]>0)
			{
				sum=sum+arr[i];
			}
		}
		return sum;
	}
}
