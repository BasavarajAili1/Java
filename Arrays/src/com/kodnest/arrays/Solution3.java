package com.kodnest.arrays;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scan.nextInt()];

		System.out.println("Enter "+arr.length+" elements of array:");
		int i=0;
		do {
			arr[i]=scan.nextInt();	
			i++;
		}while(i<=arr.length-1);

		int small=findSmallestNum(arr);
		System.out.println("Smallest Number in given Array is--> "+small);
	}

	static int findSmallestNum(int arr[]) {
		//Selection sort approach
		int help=0;
		for(int i=0;i<=arr.length-2;i++)
		{
			int min=arr[i];
			int pos=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if (arr[j]<min)
				{
					min=arr[j];
					pos=j;
				}
			}
			help=arr[i];
			arr[i]=arr[pos];
			arr[pos]=help;
		}
		return arr[0];
	}
}
