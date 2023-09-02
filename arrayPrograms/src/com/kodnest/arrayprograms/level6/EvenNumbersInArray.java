package com.kodnest.arrayprograms.level6;
import java.util.Scanner;

public class EvenNumbersInArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Length: ");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter "+arr.length+" elements of array: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		//check even or not for every number
		System.out.print("Even numbers in array: ");
		for(int num: arr) {
			if(num%2==0) {
				System.out.print(num+" ");
			}
		}
	}
}
