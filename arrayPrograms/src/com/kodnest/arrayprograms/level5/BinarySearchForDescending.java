package com.kodnest.arrayprograms.level5;

public class BinarySearchForDescending {
	int binarySearchDec(int arr[], int key){
		int low=0;
		int high=arr.length-1;

		while (low<=high) {
			int mid=(low+high)/2;

			if(key==arr[mid]) {
				return mid;
			}

			else if (key>arr[mid]) {
				high=mid-1;
				low=low;
				
			}
			else {
				low=mid+1;
				high=high;
			}
		}
		return -1;
	}
}
