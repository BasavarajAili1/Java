package com.kodnest.arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		int key=scan.nextInt();

		boolean res=LinearSearching.linearSearch(arr, key);
		if(res==true) {
			System.out.println("Key "+key+" found");
		}
		else {
			System.out.println("Key "+key+" not found");
		}

	}

}
