package com.numberProg;
import java.util.Scanner;
public class StrongNumber {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		int input =in.nextInt(),n=input;
		int sumOfFac=0;
		while(n>0) {
		int s=n%10,fact=1;
		for (int i=s;i>=1;i--)
			fact*=i;
		n/=10;
		sumOfFac+=fact;
		}
		if(sumOfFac==input) 
			System.out.println(input+"--> Its a Strong Numbe<--");
			else
			System.out.println(input+"--> Not a Strong Numbe<--");
		in.close();
		}
}
