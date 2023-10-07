package com.kodnest.arrays;

public class MaxWealth {

	public static void main(String[] args) {
		int[][] accountsOfPersons = {
				{1, 2, 5},
				{5, 4, 5},
				{4, 2, 1, 5},
				{1, 1, 0}
		};
		
		int res = maximumWealth(accountsOfPersons);
		System.out.println(res);
		

	}
	public static int maximumWealth(int[][] accounts) {
		int maxSum = Integer.MIN_VALUE;
		//run a loop for every person in persons's account 2D array
		for(int person=0; person<=accounts.length-1; person++) {
			int sum=0; //sum for every person's accounts
			//run loop for every account of person
			for(int account=0; account<=accounts[person].length-1; account++) {
				sum += accounts[person][account];
			}
			
			// here we get a sum of each person's accounts
			//check that sum is greater than overall sum
			if(sum > maxSum) {
				maxSum = sum;
			}
		}
		
		return maxSum;
	}

}
