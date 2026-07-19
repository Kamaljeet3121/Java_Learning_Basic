package com.arraysProg;

import java.util.Arrays;

/*Sorting Algorithm
 * 1.Bubble Sortr
 * 2.Selection Sort
 * 3.Insertion Sort
 * 4.MergeSort
 * 5.Quick Sort
 */

public class SortingDSAbubbleSort {
	public static void main(String[] args) {
		int [] a= {10,14,4,9,51,44,2};
		
//		int index=a.length-1;
//		while (index!=0) {
//			for(int i=1;i<=index;i++) {
//				if(a[i-1]>a[i]) {
//					int temp=a[i];
//					a[i]=a[i-1];
//					a[i-1]=temp;
//				}
//			}index--;
//		}System.out.println(Arrays.toString(a));
//	}
//}
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}System.out.println(Arrays.toString(a));
	}
}