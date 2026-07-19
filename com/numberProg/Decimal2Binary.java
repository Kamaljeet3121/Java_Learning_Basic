package com.numberProg;
import java.util.Scanner;
import java.lang.Math;
public class Decimal2Binary {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a Decimal No.: ");
	int n=in.nextInt(),value=n;
	int binary=0;
	for(int i=1;n>0;i++) {
		binary=(binary)+((int)Math.pow(10, i-1))*(n%2);
		n=n/2;
		}
	System.out.println("Binary value of("+value+") is: "+binary);
	in.close();
	}
}
