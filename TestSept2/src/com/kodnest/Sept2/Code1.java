package com.kodnest.Sept2;
import java.util.*;
public class Code1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Even numbers in the array:");
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
	}
}
