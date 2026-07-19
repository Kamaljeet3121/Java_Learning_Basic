package com.arraysProg;

import java.util.Arrays;

public class InsertElementInArray {
	public static void main(String[] args) {
		int[] a= {10,20,30,15};
		int[] b=new int[a.length+1];
		int in=60,j=0,index=2;
		
		for(int i=0;i<a.length;i++) {
			if(i==index) 
				b[j++]=in;
			
			b[j++]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}
}
