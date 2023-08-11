package com.kodnest.arrayprograms.level4;

public class MergeArrayApp {

	public int[] mergeArr(int[] arr1, int[] arr2) {
		
		int res[]=new int[arr1.length+arr2.length];
		int size1=arr1.length;
		
		for(int i=0;i<=arr1.length-1;i++) {
			res[i]=arr1[i];
		}
		
		for(int i=0;i<=arr2.length-1;i++) {
			res[size1+i]=arr2[i];
		}
		 return res;
	}
}
