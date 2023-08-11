package com.kodnest.arrayprograms.level4;

public class RemoveNegativeNum {
	int[] Remove(int arr[]) {

		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<0) {
				arr[i]=0;
			}
		}
		return arr;
	}
}
