package com.kodnest.Sept2; 
import java.util.Scanner;
public class Code5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[scanner.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scanner.nextInt();
		}
		int min=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minimum element: "+min);
	}

}
