package com.kodnest.arrayspractice.level1;

import java.util.Scanner;

public class CountingGradeApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" grades of student from 0 to 100");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}

		System.out.print("Grades of the student ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();

		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>75) {
				count=count+1;
			}
		}
		System.out.println(count+" students have scored more than 75");
	}
}
