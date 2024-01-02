
public class TwoSum {

	public static void main(String[] args) {
		int[] arr1  = {7, 3, 5, 2, -4, 8, 11}; 
		int[] arr2  = {17, 4, 5, 6, 10, 11, 4, -3, -5, 3, 15, 2, 7}; 
		int[] arr3  = {7, 6, 4, 1, 7, -2, 3, 12}; 
		
		String out1 = twoSum(arr1);		
		String out2 = twoSum(arr2);		
		String out3 = twoSum(arr3);		
		System.out.println(out1);
		System.out.println(out2);
		System.out.println(out3);
		
	}

	private static String twoSum(int[] arr) {
		int target = arr[0];
		
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] + arr[j] == target) {
					sb.append(arr[i]+","+arr[j]+" ");
				}
			}
		}
		return sb.toString().trim();
	}

}
