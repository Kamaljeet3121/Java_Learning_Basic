package com.numberProg;
//import java.util.Scanner;
public class CheckPerfect {

	public static void main(String[] args) {
		int n=4;
		while(n!=100000) {
//		Scanner in=new Scanner(System.in);
//		System.out.println("Enter a Number");
		int sum=0;
		int input =n;
//		int input=in.nextInt();
//		int check=input;
		for(int i=1;i<=(input/2);i++) {
			if(input%i==0) {
				sum+=i;
			}
		}
			if(input==sum) {
				System.out.println("Its a perfect Number:"+input);
			}
//			else {
//				System.out.println("Not a perfect Number:");
//	}
			n++;
	
//		in.close();
}
	}
}