package com.numberProg;
import java.util.Scanner;
//import java.lang.Math;
public class Dec2B {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a Decimal No.: ");
	int n=in.nextInt(),value=n;
	int binary=0,pow=1;
	while(n>0) {
		binary=(binary)+pow*(n%2);
		n=n/2;
		pow*=10;
		}
	System.out.println("Binary value of("+value+") is: "+binary);
	in.close();
	}
}
