package com.numberProg;
import java.util.Scanner;
public class LcmOfNo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 1st value:");
		int a=in.nextInt();
		System.out.println("Enter 2nd value:");
		int b=in.nextInt();
		int i=a>b?a:b;
		while(true) {
			if(i%a==0&&i%b==0) {
				System.out.printf("LCM of %d and %d is: %d",a,b,i);
				break;
			}
			i++;
		}
		in.close();
	}

}
