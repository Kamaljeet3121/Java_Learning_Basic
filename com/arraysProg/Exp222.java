package com.arraysProg;

public class Exp222 {
	public static void main(String[] args) {
		int[] a = {1,2,4,5,7};
		int j=a[0],i=0;
		while(i<a.length) {
			if(a[i]==j) {
				i++;
				j++;
			}
			else {
				System.out.println("Missing: "+j);
				j++;
			}
		}
	}
}
