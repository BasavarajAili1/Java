package com.kodnest.arrays;

public class LinearSearching {
	public  static boolean linearSearch(int[] arr, int key) {
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==key) {
				return true;
			}
		}
		return false;
	}
}
