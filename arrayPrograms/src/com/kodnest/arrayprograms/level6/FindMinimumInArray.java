package com.kodnest.arrayprograms.level6;
import java.util.Scanner;
public class FindMinimumInArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Length: ");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter "+arr.length+" elements of array: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		//find for each number
		int min=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minimum element: "+min);

	}
}
