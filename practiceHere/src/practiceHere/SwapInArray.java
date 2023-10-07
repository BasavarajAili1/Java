package practiceHere;

import java.util.Arrays;

public class SwapInArray {

	public static void main(String[] args) {
		int[] arr = {1,25,58,69,100};
		System.out.println(Arrays.toString(arr));
		
		int[] swapArr=swap(arr, 1, 2);
		System.out.println(Arrays.toString(swapArr));

	}
	static int[] swap(int[] arr, int index1, int index2) {
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		return arr;
	}

}
