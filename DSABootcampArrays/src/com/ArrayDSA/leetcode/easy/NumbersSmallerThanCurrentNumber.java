package com.ArrayDSA.leetcode.easy;

/*
 * Given the array nums, for each nums[i] find out how many numbers in the array.
Return the answer in an array.
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
 */
public class NumbersSmallerThanCurrentNumber {
	public static void main(String[] args) {
		int[] nums = {8,1,2,2,3};
		int[] res = smallerNumbersThanCurrent(nums);
		for(int x: res) {
			System.out.print(x+" ");
		}
	}
	static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        
        
        for(int i=0;i<nums.length;i++) {
        	int count = 0;
        	for(int j=0;j<nums.length;j++) {
        		if(nums[j] < nums[i]) {
        			count++;
        		}
        	}
        	res[i] = count;
        }
		
		return res;
    }
}
