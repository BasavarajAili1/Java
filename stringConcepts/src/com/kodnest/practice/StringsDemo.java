package com.kodnest.practice;
import java.util.Scanner;
public class StringsDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array length");
		char arr[]=new char[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements of array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.next().charAt(0);
		}
		
		System.out.print("Arr---> ");
		for (char c : arr) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		char arr2[]=new char[arr.length];
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=arr[i];
		}
		
		System.out.print("Arr2---> ");
		for (char x : arr2) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		
		char arr3[]=new char[arr2.length];
		int j=arr3.length-1;
		for(int i=0;i<=arr3.length-1;i++)
		{
			arr3[j]=arr2[i];
			j--;
		}
		System.out.print("Arr3---> ");
		for (char x : arr3) {
			System.out.print(x+" ");
		}
		
	
	}

}
