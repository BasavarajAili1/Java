package practiceHere;
import java.util.Arrays;
public class SwapArrayUsingTwoPointer {

	public static void main(String[] args) {
		int[] arr= {24,12,10,9,54,6};
		
		System.out.println(Arrays.toString(reverse(arr)));

	}
	static int[]  reverse(int[] arr) {
		//Using two pointers i.e. start=0 end=arr.length-1
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
				//swap start and end
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
		}
		return arr;
	}

}
