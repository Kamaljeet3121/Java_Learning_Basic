package com.arraysProg;

import java.util.Arrays;

public class MergeRandom {
	
	public static void main(String[] args) {
			int[] a= {10,20,40,50,8};
			int[] b= {30,60,70,15,60,80,90};
			int[] c=new int[a.length+b.length];
			int j=0,k=0;
//			int i=0;
//			while(i<c.length) {
//				if(j<a.length) {
//					c[i]=a[j];
//					i++;}
//				if(j<b.length) {
//					c[i]=b[j];
//					i++;}
//					j++;
			for(int i=0;i<c.length;) {
				if(k<a.length)
					c[i++]=a[k++];
				if(j<b.length) 
					c[i++]=b[j++];
			}
			System.out.println(Arrays.toString(c));
		}
	}
