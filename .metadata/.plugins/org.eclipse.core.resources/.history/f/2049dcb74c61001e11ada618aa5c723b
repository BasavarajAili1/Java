package com.ArrayDSA.leetcode.easy;

public class ShuffleTheArray {

	public static void main(String[] args) {
		int[] nums = {1,1,2,2};
		int n = nums.length / 2;
		int[] res = shuffle(nums, n);
		for(int x: res) {
			System.out.print(x+" ");
		}
		

	}
	static int[] shuffle(int[] nums, int n) {
        int[] firstArr = new int[n];
        int[] secArr = new int[n];
        int[] res = new int[nums.length];
        
        for(int i=0;i<n;i++) {
        	firstArr[i] = nums[i];
        }
        int j = 0;
        for(int i=n;i<=nums.length-1;i++) {
        	secArr[j] = nums[i];
        	j++;
        }
        

        j = 0;
        for(int i=0;i<=firstArr.length-1;i++) {
        	
        	res[j] = firstArr[i];
        	j = j+2;
        }
        j = 1;
        for(int i=0;i<=secArr.length-1;i++) {
        	
        	res[j] = secArr[i];
        	j = j+2;
        }
		return res;
    }
}
