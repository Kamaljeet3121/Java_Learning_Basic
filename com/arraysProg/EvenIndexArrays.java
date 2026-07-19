
package com.arraysProg;
import java.util.Scanner;

public class EvenIndexArrays {
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
	for(int i=0;i<=a.length;i++) {
		if(i%2==0) {
			System.out.println(a[i]);
		}
	}
	in.close();
	}
}