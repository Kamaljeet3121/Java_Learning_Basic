package com.numberProg;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a =in.nextInt();
		int check=a;
		int temp,rev=0;
		while(a>0) {
			temp=a%10;
			rev=rev*10+temp;
			a/=10;
		}
		System.out.println("rev of number is: "+rev);
		if(check==rev)
			System.out.println("Given no.("+check+") is palindrome");
		else
			System.out.println("Given no.("+check+") is not palindrome");
		in.close();
	}
}
