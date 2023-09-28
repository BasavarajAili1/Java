package com.kodnest.practiceSession.sept28;
import java.util.Scanner;
public class FindTarget {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = {1, 3, 5, 7, 8};
		int target = 4;
		
		findTarget(a, target);
	}
	
	static void findTarget(int[] arr, int target) {
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i] + arr[j] == target) {
					System.out.println(i+ " - "+j);
				}
			}
		}
		
	}
}
