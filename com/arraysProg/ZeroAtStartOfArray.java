package com.arraysProg;

import java.util.Arrays;

public class ZeroAtStartOfArray {
	public static void main(String[] args) {
		int[] a= {1,0,0,2,0,0,0,5,6};
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				int temp=a[i];
				a[i]=a[j];
				a[j++]=temp;
			}
		}System.out.println(Arrays.toString(a));
		ZeroAtEndOfArray.main();
	}
}

// **************
class ZeroAtEndOfArray {
	public static void main() {
		int[] a= {1,0,0,2,0,0,0,5,6};
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				int temp=a[i];
				a[i]=a[j];
				a[j++]=temp;
			}
		}System.out.println(Arrays.toString(a));
	}
}