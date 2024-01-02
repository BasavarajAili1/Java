package practiceHere;

public class Main2 {

	public static void main(String[] args) {
		int[] arr = {3,2,1,5,6,4};
		int k = 2;
		System.out.println(findKthLargest(arr, k));
	}
	public static int findKthLargest(int[] nums, int k) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[i] > nums[j]){
                    int help = nums[i];
                    nums[i] = nums[j];
                    nums[j] = help;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            ans = nums[i];
            if((nums.length-i)==k){
                return ans;
            }else{
                continue;
            }
        }
        return -1;
    }

}
