package com.propel.practice;

public class SeatingStudents1 {

	public static void main(String[] args) {
		int[] inputArray = {12, 2 , 6, 7, 11};
		System.out.println(seatingStudent(inputArray));
	}

	private static int seatingStudent(int[] arr) {
		int k = arr[0];
		int rows = k/2;
		int[] occupied = new int[arr.length-1];
		
		System.arraycopy(arr, 1, occupied, 0, arr.length-1);
		
		boolean[][] seats = new boolean[rows][2];
		int x = 0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<2;j++) {
				seats[i][j] = isOccupied(x+1, occupied);
				x++;
			}
		}
		
		int seating = 0;
		
		for(int i=0;i<rows-1;i++) {
			if(!seats[i][0] && !seats[i][1]) {
				seating++;
			}
			
			if(!seats[i][0] && !seats[i+1][0]) {
				seating++;
			}
			
			if(!seats[i][1] && !seats[i+1][1]) {
				seating++;
			}
		}
		
		if(!seats[rows-1][0] && !seats[rows-1][1]) {
			seating++;
		}

		return seating;
	}
	
	public static boolean isOccupied(int seat, int[] occupied) {
		for(int i: occupied) {
			if(i == seat) {
				return true;
			}
		}
		
		return false;
	}

}
