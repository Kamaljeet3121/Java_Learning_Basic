package com.arraysProg;
import java.util.Arrays;

public class CopyGivenArray {
	
	public static void main(String[] args) {
		int[] a= {15,16,3,45,35,2,36,8};
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
			System.out.printf("%d Element of Array is: %d",i,a[i]);
			System.out.println();
		}
		System.out.println(Arrays.toString(b));
	}
}