package com.kodnest.arrays;

public class BinarySearching {
public static void binarySearch(int[] arr, int key) {
	int low=0;
	int high=arr.length-1;
	
	while(low<=high) {
		int mid = (low+high)/2;
		
		if(arr[mid]==key) {
			System.out.println("key "+key+" found");
		}
		else if(key > arr[mid]) {
			low=mid+1;
		}
		else {
			high=mid-1;
		}
	}
	System.out.println("key "+key+" not found");
}
}
