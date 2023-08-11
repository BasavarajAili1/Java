package com.kodnest.Array.SearchSortAlgorithms;

import java.util.Scanner;

public class SearchSortApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements of an array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.print("Elements of array before sorting===> ");
		for(int x: arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println("=== WELCOME TO SORTING & SEARCHING ALGORITHMS ===");
		System.out.println("Please enter your choice from below given options");
		System.out.println("1 ---> BUBBLE SORT");
		System.out.println("2 ---> SELECTION SORT");
		System.out.println("3 ---> INSERTION SORT");
		System.out.println("Default ---> SELECTION SORT");
		int choice=scan.nextInt();
		
		SearchSortTechniques searchSortTechniques=new SearchSortTechniques();
		switch (choice){
		case 1: searchSortTechniques.bubbleSort(arr);
				break;
		case 2: searchSortTechniques.selectionSort(arr);
				break;
		case 3: searchSortTechniques.insertionSort(arr);
				break;
		default: searchSortTechniques.insertionSort(arr);
		}
		
		System.out.print("Elements of array after sorting===> ");
		for(int x: arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println("Enter your key to search in array...");
		int key=scan.nextInt();
		
		int res=searchSortTechniques.binarySearching(arr, key);
		if (res>=0) {
			System.out.println("Key Found At Index "+res);
		}
		else {
			System.out.println("Key Not Found");
		}

	}

}
