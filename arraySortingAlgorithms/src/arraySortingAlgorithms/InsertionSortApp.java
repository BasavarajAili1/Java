package arraySortingAlgorithms;
import java.util.Scanner;

public class InsertionSortApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements of array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.print("Array before sorting---> ");
		for(int x: arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		InsertionSort sort=new InsertionSort();
		sort.InsertionSorting(arr);
		
		System.out.print("Array after sorting---> ");
		for(int x: arr) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
