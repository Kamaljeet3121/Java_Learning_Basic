package com.numberProg;
import java.util.Scanner;
public class Spy {
public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int input=in.nextInt();
		int sum=0,prod=1,c=input;
			while(input>0) {
				sum+=input%10;
				prod*=input%10;
				input/=10;
			}
		if(sum==prod)
			System.out.println(c+" is a SPY Number");
		else	
			System.out.println(c+" is Not a SPY Number");
		in.close();
}
}
