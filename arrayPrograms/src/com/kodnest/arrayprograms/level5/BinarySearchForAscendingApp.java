package com.kodnest.arrayprograms.level5;

import java.util.Scanner;
//Binary searching approach (Works when array is in Ascending order)
public class BinarySearchForAscendingApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length of Array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements of array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}

		System.out.print("Elements of Array===> ");
		for(int x: arr) {
			System.out.print(x+" ");
		}
		System.out.println();

		System.out.println("Enter key to search in array");
		int key=scan.nextInt();

		BinarySearchForAscending search=new BinarySearchForAscending();
		int res=search.search(arr, key);

		if (res>=0) {
			System.out.print("Key Found at Index "+res);
		}
		else {
			System.out.println("Key Not Found");
		}
	}
}
