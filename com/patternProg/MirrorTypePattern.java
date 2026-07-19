package com.patternProg;

import java.util.Scanner;

public class MirrorTypePattern {
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the Size(Minimum:3/Recommended:5):");
			int size=in.nextInt()-2;
			if(size>=1) {
			
			System.out.println("\n--Diamond Pattern-----\n");
			diamond(size);
			System.out.println("\n--Diamond Inverse-----\n");
			diamondInverse(size);
			System.out.println("\n--Hollow Diamond -----\n");
			hollowDiamond(size);
			System.out.println("\n--Letter X Pattern----\n");
			xPattern(size);
			System.out.println("\n-- Plus Pattern-------\n");
			plusPattern(size);
			System.out.println("\n--Square Pattern------\n");
			squarePattern(size);
			System.out.println("\n--Butterfy Pattern----\n");
			butterfyPattern(size);
			System.out.println("\n--Hour Glass Pattern--\n");
			hourGlassPattern(size);
			
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
public static void butterfyPattern(int n) {
		
		for(int row=-n;row<=n;row++) {
			int a=row>=0?row:-row;
			for(int col=-n;col<=n;col++) {
				int b=col>=0?col:-col;
				if(a<=b)
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
		}
	}
	public static void hourGlassPattern(int n) {
		
		for(int row=-n;row<=n;row++) {
			int a=row>=0?row:-row;
			for(int col=-n;col<=n;col++) {
				int b=col>=0?col:-col;
				if(a>=b)
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
		}
	}
}