package com.patternProg;

import java.util.Scanner;

public class TrianglePat_WithAlphabets_Nos {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Size(min 3):");
		int n=in.nextInt();
		if(n>=3) {
			increasingNumbers(n);
			System.out.println();
			increasingNumbersResetsInRow(n);
			System.out.println();
			increasingNumbersTillMiddleRow(n);
			System.out.println();
			decreasingNumbersTillMiddleRow(n);
			System.out.println();
			increasingAlphabets(n);
			System.out.println();
			increasingAlphabetsResetsInRow(n);
			System.out.println();
			evenRowsPrints1(n);
			in.close();
		}
	}

	public static void increasingNumbers(int n) {
		int count=1;
		for (int row=1;row<=n;row++) {
			for(int col=1;col<=n*2-1;col++) {
				if(row+col>=n+1&&col-row<=n-1) {
					System.out.print(count++ +" ");
				}else
					System.out.print("  ");
			}System.out.println();
		}
	}
	public static void increasingNumbersResetsInRow(int n) {
		for (int row=1;row<=n;row++) {
			int count=1;
			for(int col=1;col<=n*2-1;col++) {
				if(row+col>=n+1&&col-row<=n-1) {
					System.out.print(count++ +" ");
				}else
					System.out.print("  ");
			}System.out.println();
		}
	}
	public static void increasingNumbersTillMiddleRow(int n) {
		for (int row=1;row<=n;row++) {
			int count=1;
			for(int col=1;col<=n*2-1;col++) {
				if(row+col>=n+1&&col-row<=n-1) {
					System.out.print(count +" ");
					count=col<n?count+1:count-1;
				}else
					System.out.print("  ");
			}System.out.println();
		}
	}
	public static void decreasingNumbersTillMiddleRow(int n) {
		for (int row=1;row<=n;row++) {
			int count=row;
			for(int col=1;col<=n*2-1;col++) {
				if(row+col>=n+1&&col-row<=n-1) {
					System.out.print(count +" ");
					count=col<n?count-1:count+1;
				}else
					System.out.print("  ");
			}System.out.println();
		}
	}
	public static void increasingAlphabets(int n) {
		char ch='a';
		for (int row=1;row<=n;row++) {
			for(int col=1;col<=n*2-1;col++) {
				if(row+col>=n+1&&col-row<=n-1) {
					System.out.print(ch++ +" ");
				}else
					System.out.print("  ");
			}System.out.println();
		}
	}
	public static void increasingAlphabetsResetsInRow(int n) {
		for (int row=1;row<=n;row++) {
			char ch='a';
			for(int col=1;col<=n*2-1;col++) {
				if(row+col>=n+1&&col-row<=n-1) {
					System.out.print(ch++ +" ");
				}else
					System.out.print("  ");
			}System.out.println();
		}
	}
	public static void evenRowsPrints1(int n) {
		for (int row=1;row<=n;row++) {
			for(int col=1;col<=n*2-1;col++) {
				if(row+col>=n+1&&col-row<=n-1) {
					if(row%2==0)
					System.out.print("0 ");
					else
						System.out.print("1 ");
					
				}else
					System.out.print("  ");
			}System.out.println();
		}
	}
}
