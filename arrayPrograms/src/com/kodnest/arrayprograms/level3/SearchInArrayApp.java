package com.kodnest.arrayprograms.level3;

public class SearchInArrayApp {
	 int linearSearch(int[] arr, int key) {
		for(int i=0;i<=arr.length-1;i++) {
			if (arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
}


