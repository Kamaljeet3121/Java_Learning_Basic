package com.arraysProg;

public class SecondMax {
	public static void main(String[] args) {
		int[] a= {15,16,7,2,36,8};
		int max=a[0],max2=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max2=max;
				max=a[i];
			}
		else if(a[i]>max2&&a[i]!=max) {
				max2=a[i];
		}}
		 System.out.println(max2+" "+max);
		
	}
}
