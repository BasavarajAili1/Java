package com.lgsoft.exam;

public class Main6 {

	public static void main(String[] args) {
		int[] array = {3,5,-9,1,3,-2,3,4,7,2,-9,6,3,1,-5,4};
		int x = 0, y = Integer.MIN_VALUE;
		for(int a: array) {
			y = Math.max(x = Math.max(a, x+a), y);
		}
		System.out.println(y);

	}

}
