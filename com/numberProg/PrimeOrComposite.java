package com.numberProg;
import java.util.Scanner;
public class PrimeOrComposite {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number");
		int input=in.nextInt();
		for(int i=2;i<=(input/2);i++) {
			if(input%i==0) {
				System.out.println("-->Its a Composite Number");
				break;}
			else if(i==(input/2)) 
			System.out.println("-->Its a Prime Nimber");

		}in.close();
	}
}