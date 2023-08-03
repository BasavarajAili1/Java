package com.kodnest.arrayprograms.level4;

import java.util.Scanner;

public class Question4Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length of Array");
		int arr[]=new int[scan.nextInt()];

		System.out.println("Enter "+arr.length+" elements of Array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}

		System.out.print("Array elements before removing negative numbers===> ");
		for(int x: arr) {
			System.out.print(x+" ");
		}
		System.out.println();

		RemoveNegativeNum remove=new RemoveNegativeNum();
		int res[]=remove.Remove(arr);

		System.out.print("Array elements after removing negative numbers===> ");
		for(int x: res) {
			System.out.print(x+" ");
		}

	}

}
