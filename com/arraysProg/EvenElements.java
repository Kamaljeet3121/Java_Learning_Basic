package com.arraysProg;

public class EvenElements {
	public static void main(String[] args) {
		int[] a= {10,3,45,18,20};
		System.out.println("The Arrays is:");
		for(int i=0;i<=a.length;i++) {
			if(a[i] % 2==0) {
				System.out.println(a[i]);
			}
		}
	}}