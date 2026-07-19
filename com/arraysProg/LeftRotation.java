package com.arraysProg;
import java.util.Arrays;

public class LeftRotation {
	public static void main(String[] args) {
		int[] a= {60,20,30,40,50};
		int key=a[0];
		for(int i=0;i<a.length-1;i++) 
			a[i]=a[i+1];
		
		a[a.length-1]=key;
		System.out.println(Arrays.toString(a));
	}
}