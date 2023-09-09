package com.kodnest.arrays;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double arr[]=new double[] {25.0,24,26.2,27,23.5,24,25};
		System.out.println("Daily records of Temperature for a week:");
		for (double d : arr) {
			System.out.print(d+" ");
		}
		System.out.println();
		double average=averageFinder(arr);
		System.out.printf("Average Temperature: %.2f",average);
	}

	static double averageFinder(double[] arr) {
		double sum=0;
		double average=0;
		for (double d : arr) {
			sum=sum+d;
		}
		average=sum/arr.length;
		return average;
	}
}
