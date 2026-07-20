package com.numberProg;

import java.util.Scanner;

public class XylemOrPhloem {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int input=in.nextInt();
		int innerSum=0,outerSum=0;
		outerSum+=input%10;
		input/=10;
		while(input>9) {
			innerSum+=input%10;
			input/=10;
		}
		outerSum+=input%10;
		if(innerSum==outerSum)
			System.out.println("Xylem");
		else
			System.out.println("Phloem");
		in.close();
	}
}
