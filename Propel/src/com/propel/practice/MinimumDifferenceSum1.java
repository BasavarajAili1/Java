package com.propel.practice;
import java.util.*;
public class MinimumDifferenceSum1 {

	public static void main(String[] args) {
		int[] arr = {1, 3, 3, 2, 4};
		int result = minimumDifferenceSum(arr);
		System.out.println(result); // Output: 3
	}

	private static int minimumDifferenceSum(int[] arr) {
		int sum = 0;
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++) {
			sum += Math.abs(arr[i] - arr[i-1]);
		}
		
//		for(int i=0;i<arr.length-1;i++) {
//			sum += Math.abs(arr[i] - arr[i+1]);
//		}
		return sum;
	}

}
