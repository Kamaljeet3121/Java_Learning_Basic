package com.patternProg;

import java.util.Scanner;

public class ExpNamePattern {
public static void main(String[] args) {
	int n= 9;
	Scanner in=new Scanner(System.in);
//	System.out.println("Enter the value");
//	n=in.nextInt();
//	System.out.println("-----");
	for(int row =1;row<=n*2-1;row++) {
		for(int col=1;col<=n;col++) { //Printing Letter K
			if(row+col==n+1||row-col==n-1||col==1) {
				System.out.print("* ");
			}else System.out.print("  ");
		}System.out.print(" ");
		for (int col=n+1;col<=2*n;col++) { // Printing Letter A
			if(col==n+1||row==1||col==2*n||row==n)
			System.out.print("* ");
			else 
				System.out.print("  ");
			
		}System.out.print(" ");
		for (int col=2*n+1;col<=3*n;col++) { //Printing Letter M
			if(col==2*n+1||col==3*n||(row+2*n==col&&row<=n/2+1)||(row+col==3*n+1&&row<=n/2+1))
			System.out.print("* ");
			else 
				System.out.print("  ");
			
		}System.out.print(" ");
		for (int col=3*n+1;col<=4*n;col++) { // Printing Letter A
			if(col==3*n+1||row==1||col==4*n||row==n)
			System.out.print("* ");
			else 
				System.out.print("  ");
			
		}System.out.print(" ");
		for (int col=4*n+1;col<=5*n;col++) { // Printing Letter L
			if(col==4*n+1||row==2*n-1)
			System.out.print("* ");
			else 
				System.out.print("  ");
			
		}
		System.out.println();
	}
	in.close();
	}
}
