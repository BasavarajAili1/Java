package com.lgsoft.exam;

public class Main8 {
	//What is the worst-case time complexity of the following program?
	public static void main(String[]args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int x = 7;
		int i=0,j=arr.length-1;
		while (i <=j) {
			int y = i+(j-i)/2; 
			if (arr[y]==x) {
				System.out.println(y);
				break;
			}
				if (x < arr[y])j--; 
				else i++;
			}
		}
}
