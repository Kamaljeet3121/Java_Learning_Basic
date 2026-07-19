package com.numberProg;
//import java.util.Scanner;
public class PrimeRange {

	public static void main(String[] args) {
		for (int k=1;k<=100;k++) {
			int count=0;
		for(int i=2;i<=(k/2);i++) {
			if(k%i==0) { 
				count++;
			}
		}
		if(count==0) {
			System.out.println(k);
		}
	
//		in.close();
}
}
}