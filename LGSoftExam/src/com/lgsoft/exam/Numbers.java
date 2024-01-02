package com.lgsoft.exam;

public class Numbers {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5,};
		int i = arr.length;
		while (i-->0)
		{
			System.out.printf("[%d, %d]", arr[i], arr[i-1]);
		}
	}
}
