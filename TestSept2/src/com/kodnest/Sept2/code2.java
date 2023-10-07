package com.kodnest.Sept2;
import java.util.*;
public class code2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the number of rows:");
	        int numRows = scanner.nextInt();

	        System.out.println("Enter the number of columns:");
	        int numCols = scanner.nextInt();

	        int[][] arr = new int[numRows][numCols];

	        System.out.println("Enter the elements of the matrix:");

	        // Input elements into the matrix
	        for (int i = 0; i < numRows; i++) {
	            for (int j = 0; j < numCols; j++) {
	                arr[i][j] = scanner.nextInt();
	            }
	        }
	        System.out.println("Sum of rows in the matrix:");

	        // Calculate and print the sum of each row
	        for (int i = 0; i < numRows; i++) {
	            int rowSum = 0;
	            for (int j = 0; j < numCols; j++) {
	                rowSum += arr[i][j];
	            }
	            System.out.println("Row " + (i + 1) + ": " + rowSum);
	        }
	}

}
