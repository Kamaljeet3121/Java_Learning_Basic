package com.corejava;

import java.util.Scanner;

public class ExpSuman {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		try {
			System.out.println(a/b);
		} catch (Throwable e) {
			System.out.println("Error");
		}
		System.out.println("Hii");
	}
}
