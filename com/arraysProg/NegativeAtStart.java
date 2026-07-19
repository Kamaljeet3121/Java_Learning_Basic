package com.arraysProg;

import java.util.Arrays;

public class NegativeAtStart {
	public static void main(String[] args) {
		int[] a = {-1,-5,-6,5,10,-3,4};
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}System.out.println(Arrays.toString(a));
	}
}
