package com.kodnest.arrayprograms.level1;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the "+arr.length+" elemets of array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Positive numbers in array are..");
		for(int x:arr)
		{
			if(x>=0)
			System.out.print(x+" ");
		}

	}

}
