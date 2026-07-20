package com.numberProg;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=in.nextInt();
		
		if(n%3==0 && n%5==0)
			System.out.println("Its a FizzBuzz Number");
		else if(n%3==0) 
			System.out.println("Its a Fizz Number");
		else if(n%5==0)
			System.out.println("Its a Buzz Number");
		else
			System.out.println("Its NOT a FizzBuzz Number");
		in.close();
	}
}
