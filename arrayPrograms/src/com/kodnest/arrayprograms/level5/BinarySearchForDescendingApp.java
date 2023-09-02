package com.kodnest.arrayprograms.level5;
import java.util.Scanner;

public class BinarySearchForDescendingApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements of an array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.print("Array elements are===> ");
		for(int x: arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println("Enter key to search");
		int key=scan.nextInt();
		
		BinarySearchForDescending search=new BinarySearchForDescending();
		int res=search.binarySearchDec(arr, key);
		
		if(res>=0) {
			System.out.println("Key found at Index "+res);
		}
		else {
			System.out.println("Key not found");
		}
	}
}
