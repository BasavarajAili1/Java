package leetcode.practice;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0,3,5,9,12};
		int target = 9;
		System.out.println(search(nums, target));

	}
	public static int search(int[] nums, int target) {

		int start = 0;
		int end = nums.length-1;

		while( start <= end){

			int mid = (start + end) / 2;

			if( target == nums[mid])
			{
				return mid;
			}
			else if(target > nums[mid])
			{
				start = mid+1;
			}
			else{
				end = mid-1;
			}
		}
		return -1;
	}

}
