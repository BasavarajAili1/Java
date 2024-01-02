

//public class Main {
//
//	public static int SeatingStudents(int[] arr) {
//		int k = arr[0];
//		int[] occupiedDesks = new int[arr.length - 1];
//		// Copy the occupied desks into a new array
//		System.arraycopy(arr, 1, occupiedDesks, 0, arr.length - 1);
//
//		int count = 0;
//
//		// Check each possible pair of desks
//		for (int i = 1; i <= k; i += 2) {
//			if (!isOccupied(i, occupiedDesks)) {
//				// Check the right desk
//				if (i + 1 <= k && !isOccupied(i + 1, occupiedDesks)) {
//					count++;
//				}
//				// Check the desk below
//				if (i + 2 <= k && !isOccupied(i + 2, occupiedDesks)) {
//					count++;
//				}
//			}
//		}
//
//		return count;
//	}
//
//	private static boolean isOccupied(int desk, int[] occupiedDesks) {
//		for (int occupiedDesk : occupiedDesks) {
//			if (desk == occupiedDesk) {
//				return true;
//			}
//		}
//		return false;
//	}
//
//	public static void main(String[] args) {
//		// Test cases
//		int[] arr1 = {6, 4};
//		int[] arr2 = {8, 1, 8};
//
//		System.out.println(SeatingStudents(arr1)); // Output: 4
//		System.out.println(SeatingStudents(arr2)); // Output: 6
//	}
//}
//import java.util.*;
//
//public class Main {
//
//    public static int ArrayChallenge(int[] arr) {
//        int desks = arr[0];
//        Set<Integer> occupiedDesks = new HashSet<>();
//        for (int i = 1; i < arr.length; i++) {
//            occupiedDesks.add(arr[i]);
//        }
//
//        int count = 0;
//        for (int i = 1; i <= desks - 1; i++) {
//            if (!occupiedDesks.contains(i) && !occupiedDesks.contains(i + 1)) {
//                count++;
//            }
//        }
//
//        for (int i = 1; i <= desks - 2; i++) {
//            if (!occupiedDesks.contains(i) && !occupiedDesks.contains(i + 2) && i % 2 != 0) {
//                count++;
//            }
//        }
//
//        return count;
//    }
//
//    public static void main(String[] args) {
//        int[] arr1 = {6, 4};
//        System.out.println(ArrayChallenge(arr1)); // Output: 4
//
//        int[] arr2 = {8, 1, 8};
//        System.out.println(ArrayChallenge(arr2)); // Output: 6
//    }
//}

import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println(arrayChallenge(new int[]{12, 2, 6, 7, 11})); // Expected Output: 6
		System.out.println(arrayChallenge(new int[]{6, 4})); // Expected Output: 4
		System.out.println(arrayChallenge(new int[]{8, 1, 8})); // Expected Output: 6
	}

	public static int arrayChallenge(int[] arr) {
		int k = arr[0];
		Set<Integer> occupiedDesks = new HashSet<>();
		for (int i = 1; i < arr.length; i++) {
			occupiedDesks.add(arr[i]);
		}

		int[] dp = new int[k + 1];
		dp[0] = 1;
		dp[1] = 0;

		for (int i = 2; i <= k; i++) {
			if (!occupiedDesks.contains(i) && !occupiedDesks.contains(i - 1)) {
				dp[i] = dp[i - 1] + dp[i - 2];
			} else {
				dp[i] = dp[i - 1];
			}
		}

		return dp[k];
	}
}



