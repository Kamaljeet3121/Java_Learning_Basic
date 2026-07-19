package com.numberProg;
import java.util.Scanner;
public class Fibo {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int a=0,b=1;
	System.out.println();
	int e=in.nextInt();
	for (int c=1;c<=e;c++) {
		int d=a+b;
		System.out.println(a);
		a=b;
		b=d;
	}
	in.close();
}
}
