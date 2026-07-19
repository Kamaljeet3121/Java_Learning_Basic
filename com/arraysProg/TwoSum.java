package com.arraysProg;

public class TwoSum {
	public static void main(String[] args) {
		int[] a= {10,20,5,7,99,1};
		int target =110;
		for (int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==target) {
					System.out.println("index: "+i+" "+j);
					break;
				}
				if(i==a.length-2&&j==a.length-1)
					System.out.println("Not Found");
			}
		}
	}
}
