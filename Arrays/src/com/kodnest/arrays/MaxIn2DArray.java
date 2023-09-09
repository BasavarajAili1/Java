package com.kodnest.arrays;

public class MaxIn2DArray {

	public static void main(String[] args) {
		int[][] arr= {
				{23, 4, 25},
				{45, 45, 100, 23},
				{1, 54, 5, 14, 15},
				{45, 58}
		};
		
		int res=search(arr);
		System.out.println(res);

	}
	static int search(int[][] arr) {

		int max = Integer.MIN_VALUE;

		for(int row=0;row<=arr.length-1;row++) {
			for(int col=0;col<=arr[row].length-1;col++) {
				if(arr[row][col]>max) {
					max = arr[row][col];
				}
			}
		}
		return max;
		
	}

}
