package com.numberProg;
import java.util.Scanner;
import java.lang.Math;
public class Binary2Decimal {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a Binary Number: ");
	int n=in.nextInt(),value=n;
	int decimal=0;
	for(int i=0;n>0;i++) {
		decimal=(decimal)+((int)Math.pow(2, i))*(n%10);
		n=n/10;
		}
	System.out.println("Decimal value of("+value+") is: "+decimal);
	in.close();
	}
}
