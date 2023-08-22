package com.kodnest.arrays;
import java.util.Scanner;

public class Solution10 {

	public static void main(String[] args) {
		System.out.println("Enter length of array");
		Scanner scan = new Scanner(System.in);
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

		int res=checkDuplicate(arr);
		if(res>0) {
			System.out.println("Duplicates are present in array!!");
		}
		else {
			System.out.println("No! duuplicates are present in array");
		}

	}

	public static int checkDuplicate(int arr[]) {
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if (arr[i]==arr[j]) 
				{
					return j;
				}
			}
		}
		return -1;
	}

}
