package com.kodnest.arrays;
import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[]=new int[] {10,0,65,48,86,45,78};
		System.out.println("Score of the students:");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int count=count(arr);
		System.out.println("Count of students who have scored more than 75: "+count);
	}
	
	static int count(int arr[]) {
		int count=0;
		for (int i : arr) {
			if(i>75) {
				count=count+1;
			}
		}
		return count;
	}
}
