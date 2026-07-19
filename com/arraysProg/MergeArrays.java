package com.arraysProg;
import java.util.Arrays;

public class MergeArrays {
	public static void main(String[] args) {
		int[] a= {10,20,40,50,80};
		int[] b= {30,60,70};
		int[] c=new int[a.length+b.length];
		for(int i=0;i<c.length;i++) {
			if(i<a.length)
				c[i]=a[i];
			else 
				c[i]=b[i-a.length];
		}
		System.out.println(Arrays.toString(c));
	}
}