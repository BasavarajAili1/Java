package com.kodnest.arrayprograms.level1;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the "+arr.length+" elemets of array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array contents are...");
		//Traditional for loop
//		for(int i=0;i<=arr.length-1;i++)
	//	{
	//		System.out.print(arr[i]+" ");
	//	}
		for( int x:arr)
		{
		System.out.print(x+" ");
		}
}
}
