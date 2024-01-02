package com.propel.practice;

public class StockPicker1 {

	public static void main(String[] args) {
		int[] arr1 = {44, 30, 24, 32, 35, 30, 40, 38, 15};
		int[] arr2 = {10, 9, 8, 2};
		int[] arr3 = {10, 12, 4, 5, 9};

		System.out.println(stockPicker(arr1)); // Output: 16
		System.out.println(stockPicker(arr2)); // Output: -1
		System.out.println(stockPicker(arr3)); // Output: 5
	}

	private static int stockPicker(int[] arr) {
		int maxProfit = -1;
		int minPrice = Integer.MAX_VALUE;
		
		for(int price: arr) {
			if(price < minPrice) {
				minPrice = price;
			}else if(price - minPrice > maxProfit) {
				maxProfit = price - minPrice;
			}
		}
		return maxProfit;
	}

}
