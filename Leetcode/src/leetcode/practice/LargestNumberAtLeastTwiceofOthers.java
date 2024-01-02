package leetcode.practice;

public class LargestNumberAtLeastTwiceofOthers {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(dominantIndex(arr));

	}
	public static int dominantIndex(int[] nums) {
		int max = nums[0];
		int maxIndex = 0;

		for(int i=0;i<=nums.length-1;i++){
			if(nums[i] > max){
				max = nums[i];
				maxIndex = i;
			}
		}

		int i = 0;
		while( i < nums.length){
			int curElement = nums[i];
			if(i == maxIndex) {
				i++;
			}
			else if(curElement + curElement <= max){
				i++;
			}
			else{
				return -1;
			}
		}
		return maxIndex;
	}
}
