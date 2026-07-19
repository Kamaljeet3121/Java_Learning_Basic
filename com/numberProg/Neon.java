package com.numberProg;
import java.util.Scanner;
import java.lang.Math;
public class Neon {

	public static void main(String[] args) {
		Scanner	in=new Scanner(System.in);
		System.out.println("Enter a No.");
		int a=in.nextInt();
		for(int i=1;i<=a;i++) {
		int input =i;
		int squareInput=(int)Math.pow(input, 2);// Square of the input
		int sumOfSqVal;
		for(sumOfSqVal=0;squareInput>0;squareInput/=10) {
			sumOfSqVal+=squareInput%10;
		}
		if(sumOfSqVal==input) {
			System.out.println(input+" is a Neon Number"+squareInput);
		}
		}
		in.close();
	}

}
