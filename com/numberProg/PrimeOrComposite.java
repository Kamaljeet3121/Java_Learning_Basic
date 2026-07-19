package com.numberProg;
import java.util.Scanner;
public class PrimeOrComposite {

	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//		System.out.println("Enter a Number");
//		while(in.hasNextInt()) {
//		int input=in.nextInt();
//		int count=0;
//		for(int i=2;i<=(input/2);i++) {
//			if(input%i==0) {
//				count++;
//				break;}
//		}
//		if(count==0) 
//			System.out.println("-->Its a Prime Nimber");
//		else
//			System.out.println("-->Its a Composite Number");
//		System.out.println("------------------\nEnter another Number:");
//		}
//		System.out.println("--Not a Number--\nExiting......");
//		in.close();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number");
		while(in.hasNextInt()) {
		int input=in.nextInt();
		for(int i=2;i<=(input/2);i++) {
			if(input%i==0) {
				System.out.println("-->Its a Composite Number");
				break;}
			else if(i==(input/2)) 
			System.out.println("-->Its a Prime Nimber");
		}
		System.out.println("------------------\nEnter another Number:");
		}
		System.out.println("--Not a Number--\nExiting......");
		in.close();
	}

}
