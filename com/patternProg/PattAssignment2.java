package com.patternProg;

public class PattAssignment2 {
	public static void main(String[] args) {
		int n = 3;
		for (int row = 1; row <= n; row++) {
			int k = 1;
			for (int col = 1; col <= n * 2 - 1; col++) {
				if (row + col >= n + 1 && row + n - 1 >= col) {
					System.out.print(k + " ");
					if (col < n) {
						k++;
					} else {
						k--;
					}
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
}
