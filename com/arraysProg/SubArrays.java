package com.arraysProg;

public class SubArrays {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		for(int k=0;k<a.length;k++) {
		for(int i=k;i<a.length;i++) {
			for(int j=k;j<=i;j++) {
				System.out.print(a[j]+" ");
			}System.out.println("");
		}
	}
	}
}
