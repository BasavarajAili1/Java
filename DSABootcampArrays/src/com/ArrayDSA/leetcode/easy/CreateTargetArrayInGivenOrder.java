package com.ArrayDSA.leetcode.easy;
import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayInGivenOrder {

	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4};
		int[] index = {0,1,2,2,1};
		int[] target = createTargetArray(nums, index);
		for(int x: target) {
			System.out.print(x+" ");
		}
	}
	static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        List<Integer> arr = new ArrayList<Integer>(nums.length);
        for(int i=0;i<nums.length;i++) {
        	arr.add(index[i], nums[i]);
  
        }
        
        for(int i=0;i<target.length;i++) {
        	target[i] = arr.get(i);
        }
        return target;
    }
}

