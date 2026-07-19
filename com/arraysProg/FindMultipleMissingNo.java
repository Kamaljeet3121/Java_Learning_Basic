package com.arraysProg;

public class FindMultipleMissingNo {
	public static void main(String[] args) {
		int[] a= {1,2,7,9,11};
//		int j=0;
//		for(int i=a[0];i<=a[a.length-1];i++) {
//			if(a[j]==i) {
//				j++;
//				continue;
//			}
//			else 
//				System.out.println("missing: "+i);
//		}
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