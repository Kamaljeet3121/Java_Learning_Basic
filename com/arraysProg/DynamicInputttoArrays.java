package com.arraysProg;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicInputttoArrays {
	public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	System.out.println("Enter the Size of Array to create:");
	int size= in.nextInt();
	int[] a=new int[size];
	for (int i=0;i<a.length;i++) {
		System.out.println("Enter the element at "+i+" index:");
		a[i]=in.nextInt();
	}
	System.out.println("The Arrays is:");
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	in.close();
	}
}