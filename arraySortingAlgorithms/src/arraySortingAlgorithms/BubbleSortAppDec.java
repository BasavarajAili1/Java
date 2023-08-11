package arraySortingAlgorithms;

import java.util.Scanner;

public class BubbleSortAppDec {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements of array..");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}

		System.out.print("Array elements before sorting===> ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();

		SortDescending sort=new SortDescending();
		sort.bubbleSorting(arr);// Descending order

		System.out.print("Array elements after sorting===> ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
