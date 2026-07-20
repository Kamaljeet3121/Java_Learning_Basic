package com.numberProg;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int input = in.nextInt(),rev=0,check=input;
		while(input>0) {
			rev=rev*10+(input%10);
			input/=10;
		}
		if(rev==check) 
			System.out.println(check+" is a Palindrome Number");
		else
			System.out.println(check+" is Not a Palindrome Number");
		in.close();
	}
}
