package com.arraysProg;

import java.util.Arrays;

public class RightRotaion {
	
		public static void main(String[] args) {
			int[] a= {10,20,30,40,50};
			int n=2;
			for(int j=0;j<n;j++) {
			int key=a[a.length-1];
			for(int i=a.length-1;i>0;i--) 
				a[i]=a[i-1];
			
			a[0]=key;
			}
			System.out.println(Arrays.toString(a));
		}
	}