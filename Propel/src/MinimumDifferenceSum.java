import java.util.Arrays;

public class MinimumDifferenceSum {

    public static int minimumDifferenceSum(int[] arr) {
        Arrays.sort(arr); // Sort the array in ascending order
        int sum = 0;

        for (int i = 1; i < arr.length; i++) {
            sum += Math.abs(arr[i] - arr[i - 1]); // Calculate absolute difference between adjacent elements
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 2, 4};
        int result = minimumDifferenceSum(arr);
        System.out.println(result); // Output: 3
    }
}
