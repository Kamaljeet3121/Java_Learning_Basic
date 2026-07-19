package com.arraysProg;

import java.util.Arrays;

public class ReverseArray2 {
		public static void main(String[] args) {
//			int[] a= {10,20,30,40,50,60,70,88,99};
//			for(int i=0;i<=a.length/2;i++) {
//				int temp=a[i];
//				a[i]=a[a.length-1-i];
//				a[a.length-1-i]=temp;
//			}
//			System.out.println(Arrays.toString(a));
//		}
//	}
//****************just reverse without saving******************
//			int[] a= {10,20,30,40,50,60,70,88,99};
//			int[] b=new int[a.length];
//
//			for(int i=0;i<=a.length/2;i++) {
//				b[i]=a[a.length-1-i];
//				b[a.length-1-i]=a[i];
//			}
//			System.out.println(Arrays.toString(b));
//		}
//}
//*************saving and printing reverse arrays*****************

		int[] a= {10,20,30,40,50,60,70,88,99};
		int st=0 , end=a.length-1;
		while (st<end) {
			int temp=a[st];
			a[st]=a[end];
			a[end]=temp;
			st++;
			end--;
		}
		System.out.println(Arrays.toString(a));
	}
}