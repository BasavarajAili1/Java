package com.kodnest.arrayprograms.level4;

public class SumOfArrayElementsApp {
	int sumOfArray(int arr[]) {
		
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
}
