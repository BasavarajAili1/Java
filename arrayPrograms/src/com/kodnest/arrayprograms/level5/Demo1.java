package com.kodnest.arrayprograms.level5;
import java.util.Scanner;

public class Demo1 {

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
			System.out.println(x+" ");
		}
		
		System.out.println("Enter key to search");
		int key=scan.nextInt();
		
		Demo1App search=new Demo1App();
		int res=search.binarySearchDec(arr, key);
		
		if(res==key) {
			System.out.println("Key found");
		}
		else {
			System.out.println("Key not found");
		}

	}

}
