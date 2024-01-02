package com.ArrayDSA.leetcode.easy;

//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].
//
//Example 1:
//
//Input: nums = [2,5,1,3,4,7], n = 3
//Output: [2,3,5,4,1,7] 
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
