package com.arraysProg;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int [] a= {10,50,60,25,18,70,88,97,28};
		Arrays.sort(a);
		int ele=60;
		System.out.println(Arrays.toString(a));
		System.out.println(isSearch(a, ele));
}

	public static String isSearch(int[] a, int ele) {
		int st=2, end=a.length-1;
		
		while(st<=end) {
			int mid=(st+end)/2;
			if(ele==a[mid])
				return "element found at index: "+mid;
				
			else if(ele> a[mid])
				st=mid+1;
			
			else if(ele<a[mid])
				end=mid-1;
		}
		return "Element Not Found";
	}
}