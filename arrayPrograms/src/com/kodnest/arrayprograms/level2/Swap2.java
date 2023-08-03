package com.kodnest.arrayprograms.level2;

import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the "+arr.length+" elemets of array");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("===== Before Swapping =====");
		for(int x: arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Enter 2 indexes to swap them");
		int index1=scan.nextInt();
		int index2=scan.nextInt();
		int help;
		help=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=help;
		
		System.out.println("===== After Swapping =====");
		for(int x: arr)
		{
			System.out.print(x+" ");
		}
	}
}
