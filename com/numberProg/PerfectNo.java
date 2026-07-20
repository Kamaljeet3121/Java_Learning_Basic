package com.numberProg;

import java.util.Scanner;

public class PerfectNo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int input= in.nextInt(),sumOfFactors=0;
		for(int i=1;i<=input/2;i++)
			if(input % i ==0)
				sumOfFactors+=i;
		if(sumOfFactors==input)
			System.out.println(input+"->is a Perfect Number");
		else
		System.out.println(input+"->is a Not a Perfect Number");
		in.close();
	}
}
