package com.arraysProg;

import java.util.Arrays;

public class NegativeAtEnd {
	public static void main(String[] args) {
		int[] a= {1,-5,-6,5,10,-3,4};
//		for(int i=0;i<a.length;i++) {
//			if(a[i]<0) {
//				for(int j=a.length-1;j>=0;j--) {
//					if(a[j]>0) {
//						int temp=a[j];
//						a[j]=a[i];
//						a[i]=temp;
//						break;
//					}
//				}
//			}
//		}System.out.println(Arrays.toString(a));
//	}
//}
//**
//int[] b= new int[a.length];
//int j=0;
//for(int i=0;i<a.length;i++) {
//	if(a[i]>0)
//		b[j++]=a[i];
//}
//for(int i=0;i<a.length;i++) {
//	if(a[i]<0)
//		b[j++]=a[i];
//}System.out.println(Arrays.toString(b));
//
//}
//}
			int j=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]>0) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					j++;
				}
			}System.out.println(Arrays.toString(a));
	}
}
















