package com.kodnest.problemsBinarySeacrh;
//binary search approach
//floor of a number is nothing but greatest number smaller than equal to target number
public class FloorNumber {

	public static void main(String[] args) {
		int[] arr = {2, 4, 5, 9, 14, 16, 18};
        int target = 15; // ans: index 4

        int ans = floor(arr, target);
        if(ans>=0) {
            System.out.println("Result found at: " + ans);
        }else {
            System.out.println("Result not found");
        }
	}
	
	static int floor(int[] arr, int target){
        int start = 0;
        int end  = arr.length-1;

        if(target > arr[arr.length-1]){
            return -1;
        }
        while (start<=end){
            int mid = (start+end)/2;

            if (target == arr[mid]){
                return mid;
            }
            else if(target >= arr[mid]){
                start = mid+1;
            }
            else if (target <= arr[mid]){
                end = mid-1;
            }
        }
        return end;
    }
}
