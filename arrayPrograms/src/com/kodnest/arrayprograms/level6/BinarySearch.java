package com.kodnest.arrayprograms.level6;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length:");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter "+arr.length+" elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.print("Array--> ");
		for(int x: arr) {
			System.out.print(x+" ");
		}
		
		//take key from user to search
		System.out.println("Enter key to search");
		int key=scan.nextInt();
		int low=0;
		int high=arr.length-1;
		int mid=0;
		for(int i=0;i<=arr.length-1;i++){
			mid=(low+high)/2;
			
			if(arr[mid]==key) {
				System.out.println("Key found at--> "+mid);
				break;
			}
			else if(key<arr[mid]) {
				//low=low;
				high=mid-1;
			}
			else {
				//high=high;
				low=mid+1;
			}
			
		}

	}

}
