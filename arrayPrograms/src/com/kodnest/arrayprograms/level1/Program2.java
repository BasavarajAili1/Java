package com.kodnest.arrayprograms.level1;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the "+arr.length+" elemets of array to store");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Each Array contents after incrementing by 5 are...");
		for( int x:arr)
		{
		System.out.print(x+5+" ");
		}
}
}
