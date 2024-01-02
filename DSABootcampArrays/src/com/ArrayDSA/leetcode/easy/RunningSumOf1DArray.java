package com.ArrayDSA.leetcode.easy;

// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
public class RunningSumOf1DArray {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[] runningSum = runningSum(nums);
		for(int x: runningSum) {
			System.out.print(x+" ");
		}
	}
	static int[] runningSum(int[] nums) {
        int prevSum = 0;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
        	prevSum += nums[i];
        	res[i] = prevSum;
        }	
		return res;
    }
}
