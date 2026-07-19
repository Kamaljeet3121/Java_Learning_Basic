package com.patternProg;

import java.util.Scanner;

public class MirrorTypePattern {
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the Size(Minimum 3):");
			int size=in.nextInt()-2;
			if(size>=1) {
			
			System.out.println("--Diamond Pattern-----\n");
			diamond(size);
			System.out.println("--Diamond Inverse-----\n");
			diamondInverse(size);
			System.out.println("--Hollow Diamond -----\n");
			hollowDiamond(size);
			System.out.println("--Letter X Pattern----\n");
			xPattern(size);
			System.out.println("-- Plus Pattern-------\n");
			plusPattern(size);
			System.out.println("--Square Pattern------\n");
			squarePattern(size);
			}else
				System.out.println("Invalid Size");
			in.close();
		}
	public static void diamond(int n) {
	
		for(int row=-n;row<=n;row++) {
			int a=row>=0?row:-row;
			for(int col=-n;col<=n;col++) {
				int b=col>=0?col:-col;
				if(a+b<=n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
		}
	}
	public static void diamondInverse(int n) {
		
		for(int row=-n;row<=n;row++) {
			int a=row>=0?row:-row;
			for(int col=-n;col<=n;col++) {
				int b=col>=0?col:-col;
				if(a+b>=n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
		}
	}
	public static void hollowDiamond(int n) {
	
		for(int row=-n;row<=n;row++) {
			int a=row>=0?row:-row;
			for(int col=-n;col<=n;col++) {
				int b=col>=0?col:-col;
				if(a+b==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
		}
	}
	public static void xPattern(int n) {
	
		for(int row=-n;row<=n;row++) {
			int a=row>=0?row:-row;
			for(int col=-n;col<=n;col++) {
				int b=col>=0?col:-col;
				if(a==b)
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
		}
	}	
	public static void plusPattern(int n) {
			
			for(int row=-n;row<=n;row++) {
				int a=row>=0?row:-row;
				for(int col=-n;col<=n;col++) {
					int b=col>=0?col:-col;
					if(a==0||b==0)
						System.out.print("* ");
					else
						System.out.print("  ");
				}System.out.println();
			}
		}
	public static void squarePattern(int n) {
		
		for(int row=-n;row<=n;row++) {
			int a=row>=0?row:-row;
			for(int col=-n;col<=n;col++) {
				int b=col>=0?col:-col;
				if(a==n||b==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
		}
	}
}