package com.kodnest.arrayprograms.level5;

public class Demo1App {
	int binarySearchDec(int arr[], int key){
		int low=arr[0];
		int high=arr[arr.length-1];
		int mid=0;
		arr[mid]=(low+high)/2;

		while (low<=high) {
			arr[mid]=(low+high)/2;

			if(key==arr[mid]) {
				return arr[mid];
			}

			else if (key>arr[mid]) {
				high=arr[mid]-1;
				low=low;
				
			}
			else {
				low=arr[mid]+1;
				high=high;
			}
		}
		return 0;
	}
}
