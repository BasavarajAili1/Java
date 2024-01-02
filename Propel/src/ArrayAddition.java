import java.util.Arrays;

public class ArrayAddition {
	
	public static boolean checkCombination(int[] arr, int target) {
		if (target == 0) {
			return true;
		}
		if (arr.length == 0) {
			return false;
		}

		boolean includeLast = checkCombination(Arrays.copyOfRange(arr, 0, arr.length - 1), target - arr[arr.length - 1]);
		boolean excludeLast = checkCombination(Arrays.copyOfRange(arr, 0, arr.length - 1), target);

		return includeLast || excludeLast;
	}

	public static boolean arrayAddition(int[] arr) {
		Arrays.sort(arr);
		int maximum = arr[arr.length - 1];
		arr = Arrays.copyOfRange(arr, 0, arr.length - 1);
		

		return checkCombination(arr, maximum);
	}

	public static void main(String[] args) {
		int[] arr1 = {5, 7, 16, 1, 2};
		int[] arr2 = {3, 5, -1, 8, 12};
		int[] arr3 = {6, 6, 12};
		int[] arr4 = {6, 12, 5, 1, -1};
		int[] arr5 = {-1, -1, 2};
		
		System.out.println(arrayAddition(arr1)); // Output: false
		System.out.println(arrayAddition(arr2)); // Output: true 
		System.out.println(arrayAddition(arr3)); // Output: true 
		System.out.println(arrayAddition(arr4)); // Output: true 
		System.out.println(arrayAddition(arr5)); // Output: false 
	}
}

