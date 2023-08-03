package com.kodnest.arrayprograms.level3;

import java.util.Scanner;

public class SearchInArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter lenght of Array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements of Array..");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}

		System.out.println("Enter Key to search");
		int key=scan.nextInt();
		SearchInArrayApp search=new SearchInArrayApp();
		int res=search.linearSearch(arr, key);

		if (res>0)
		{
			System.out.println("Key Found");
		}
		else
			System.out.println("Key Not Found");
	}

}
