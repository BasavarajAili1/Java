package practiceHere;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		int[][] arr= {
				{23, 4, 25},
				{45, 45, 6, 23},
				{1, 54, 5, 14, 15},
				{45, 58}
		};
		
		int target=54;
		
		int[] res=search(arr, target);
		System.out.println(Arrays.toString(res));
		

	}
	static int[] search(int[][] arr, int target) {
		for(int row=0;row<=arr.length-1;row++) {
			for(int col=0;col<=arr[row].length-1;col++) {
				if(arr[row][col]==target) {
					return new int[] {row, col};
				}
			}
		}
		
		return new int[] {-1, -1};
	}

}
