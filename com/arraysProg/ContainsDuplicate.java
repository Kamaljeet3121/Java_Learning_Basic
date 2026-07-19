package com.arraysProg;

import java.util.Arrays;

public class ContainsDuplicate {
	public static void main(String[] args) {
		int[] a= {1,2,6,3,6};
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				System.out.println("duplicate found");
				break;
			}
			else if(i==a.length-2)
				System.out.println("not found");
		}
	}
}
