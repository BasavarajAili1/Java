package com.kodnest.arrayprograms.level4;

import java.util.Scanner;

public class Question1Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter lenght of 1st Array");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter lenght of 2nd Array");
		int arr2[]=new int[scan.nextInt()];
		
		System.out.println("Enter "+arr1.length+" elements of 1st Array..");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
		}
		
		System.out.println("Enter "+arr2.length+" elements of 2nd Array..");
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=scan.nextInt();
		}
		
		System.out.print("Elements of 1st Array===> ");
		for(int x: arr1) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.print("Elements of 2nd Array===> ");
		for(int x: arr2) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		MergeArrayApp merge=new MergeArrayApp();
		int res[]=merge.mergeArr(arr1, arr2);
		
		System.out.print("Elements of merged Array===> ");
		for(int x: res) {
			System.out.print(x+" ");
		}
	}
}
