package com.arraysProg;

import java.util.Arrays;

public class SortingSelectionShot {
	public static void main(String[] args) {
		int[] a= {100,20,7,25,13,1};
		for(int i=0;i<a.length;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index])
					index=j;
			}if(i!=index) 
				{
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
				System.out.println("---");
				}
				
			}System.out.println(Arrays.toString(a));
				
		}
	}
