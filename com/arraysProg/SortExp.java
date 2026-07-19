package com.arraysProg;

import java.util.Arrays;

public class SortExp {
		public static void main(String[] args) {
			int[] a = {10,7,9,88,6,45,35};
//			for(int i=0;i<a.length-1;i++) {
//				for(int j=1;j<a.length;j++) {
//					if(a[j-1]>a[j]) {
//						int temp=a[j-1];
//						a[j-1]=a[j];
//						a[j]=temp;
//					}
//				}
//			}System.out.println(Arrays.toString(a));
//		}
//}
//			*************Bubble*******************
//			for(int i=0;i<a.length;i++) {
//				int index=i;
//				for(int j=i+1;j<a.length;j++)
//					if(a[j]<a[index])
//						index=j;
//					
//					int temp=a[index];		//if index and i is equal (if block not exe even once).
//					a[index]=a[i];
//					a[i]=temp;
//				}
//			System.out.println(Arrays.toString(a));
//		}
//}
//*************Selection***************
			for(int i=1;i<a.length;i++) {
				int j=i-1, key=a[i];
				while(j>=0&&a[j]>key) {
					a[j+1]=a[j];
					j--;
				}
				a[j+1]=key;
			}
			System.out.println(Arrays.toString(a));
		}
}
//***************insertion*************