package com.numberProg;
import java.util.Scanner;
public class SpyNumbers {
public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number:");
		long b=in.nextLong();
//		System.out.println("Enter a Number:");
		for(long c=10l;b>=c;c++) {
		long a=c;
//		int prod=CountOfDigits.prodDigits(a);
//		int sum=CountOfDigits.sumDigits(a);
//		if(prod==sum)
			System.out.println(c+" No.is a spy");
//		else
//			System.out.println("Not a spy No.");
		}
		in.close();
}
}
