package com.arraysProg;

import java.util.Arrays;

public class SortingInsertionSort {
	public static void main(String[] args) {
		int[] a= {20,15,30,7,3,5,1,2};
		for(int i=1;i<a.length;i++) {
			int j=i-1;
			int key=a[i];
			
			while(j>=0&&key<a[j]) {
						a[j+1]=a[j];
						j--;
					}
				a[j+1]=key;
			}
		System.out.println(Arrays.toString(a));
	}
}