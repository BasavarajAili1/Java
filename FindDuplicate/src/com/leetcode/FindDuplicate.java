package com.leetcode;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {

			int[] nums = {3,1,3,4,2};
			LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
			int duplicate = 1;
			
			for(int num: nums){
				hm.put(num, hm.getOrDefault(num, 0)+1);
			}

			
//			Collection<Integer> cn = hm.values();
			for(int num: hm.values()) {
				if(num > 1) {
					duplicate = hm.remove(num);
				}
			}
			System.out.println(duplicate);
			
	}

}
