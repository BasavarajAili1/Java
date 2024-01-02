package com.ArrayDSA.leetcode.easy;

public class ShuffleTheArray2 {

	public static void main(String[] args) {
		int[] nums = {2,5,1,3,4,7};
		int n = nums.length / 2;
		int[] res = shuffle(nums, n);
		for(int x: res) {
			System.out.print(x+" ");
		}

	}
	static int[] shuffle(int[] nums, int n) {
		int[] res = new int[nums.length];
		int j = 0;
		for(int i=0;i<=res.length-1;i+=2) {
			res[i] = nums[j++];
			res[i+1] = nums[n++];
		}
		return res;
	}
}
