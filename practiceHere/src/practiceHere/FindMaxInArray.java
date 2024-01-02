package practiceHere;
import java.util.Scanner;
public class FindMaxInArray {

	public static void main(String[] args) {
		int arr[] =  {1,2,6,85,28,32};
		
		System.out.println(max(arr));

	}
	static int max(int[] arr) {
		int maxVal=arr[0];
		
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]>maxVal) {
				maxVal=arr[i];
			}
		}
		return maxVal;
	}
	

}
