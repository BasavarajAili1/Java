package com.kodnest.arrays;

import java.util.Scanner;

public class Solution8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array");
		int arr[]=new int[scan.nextInt()];

		System.out.println("Enter "+arr.length+" numbers of array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}

		System.out.print("All the numbers of array--> ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();

		System.out.print("Prime numbers in array--> ");
		for(int i=0;i<=arr.length-1;i++)
		{
			int prime=checkPrime(arr[i]);
			if (prime>0) {
				System.out.print(prime+" ");
			}
		}
	}

	public static int checkPrime(int num) {
		if (num<2)
		{
			return -1;
		}
		else if(num==2)
		{
			return num;
		}
		else if (num%2==0)
		{
			return -1;
		}
		else {
			return num;
		}
	}
}
