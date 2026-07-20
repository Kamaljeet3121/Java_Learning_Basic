package com.numberProg;
import java.util.Scanner;
import java.lang.Math;
public class Neon {

	public static void main(String[] args) {
		Scanner	in=new Scanner(System.in);
		System.out.println("Enter a No.");
		int input=in.nextInt();
		int square=(int)Math.pow(input, 2);// Square of the input
		int sumOfSqVal=0;
		while(square>0) {
			sumOfSqVal+=square%10;
			square/=10;
		}
		if(sumOfSqVal==input) 
			System.out.println(input+" is a Neon Number");
		else 
			System.out.println(input+" is not a Neon Number");
		in.close();
	}

}
