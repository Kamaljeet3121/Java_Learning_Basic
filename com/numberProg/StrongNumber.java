package com.numberProg;
//import java.util.Scanner;
public class StrongNumber {
	
	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
		int k=11;
//		System.out.println("Enter a number:");
		while(k!=10000) {
		int sumOfFac=0;
		int n=k;
		int check=n;
		while(n>0) {
		int s=n%10;
		int res=1;
		for (int i=s;i>=1;i--) {
			res=res*i;
			}
		n/=10;
		sumOfFac+=res;
//		in.close();
	}
		if(sumOfFac==check) 
			System.out.println("--> Its a Strong Numbe<--"+check);
//			else
//			System.out.println("Not a Strong Number:");
		k++;
		}
		}

}
