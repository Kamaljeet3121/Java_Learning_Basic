package com.arraysProg;

public class FindMissingArrayElement {
	public static void main(String[] args) {
		int sum=0;
		int [] a= {1,2,3,4,5,7,8};
		int expSum=(a.length+1)*(a.length+2)/2; 
		/*
		 * Given that 1 element is missing
		 so Expected length of array is given array a.length+1
		 and sum of nth series is n*(n+1)/2
		 */	
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("missing element: "+(expSum-sum));
		System.out.println(expSum);
	}
}