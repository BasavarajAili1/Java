package com.lgsoft.exam;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		int[][] array = new int[][] {{0, 9, 8, 7}, {1, 2, 3, 4}, {6,5,7,8}, {4,3,2,1}};
		List<Integer> sol = new ArrayList<>();
		int n = array.length, m = array[0].length, i = 0, j = 0, k = n-1, l = m-1;
		while (i <= k && j<=l) {
			for (int col=j;col<=l;col++) sol.add(array[i][col]);
			for (int row=i+1;row<=k;row++) sol.add(array[row][l]);
			for (int col=l-1;col>=j;col--) {
				if (i == k) break;
				sol.add(array[k][col]);
			}
			
			for (int row=k-1;row>i;row--) {
				if (j == l) break;
				sol.add(array[row][j]);
			}
			i++;k--;j++;l--;
		}
		System.out.println(sol);
	}
}
