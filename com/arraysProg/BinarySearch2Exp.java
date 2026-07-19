package com.arraysProg;

import java.util.Arrays;

public class BinarySearch2Exp {
		public static void main(String[] args) {
			int[] a = {20,15,80,96,4,88,21,41};//[4,15,20,21,41,80,88,96]
			Arrays.sort(a);					   // 0, 1, 2, 3, 4, 5, 6, 7
			
			int target =96,st=0,end=a.length-1,mid=a.length;
			
			while(st<=end) {	//if target is last element st==end is mandatory
				mid=(st+end)/2;
				System.out.println("--");
				if (a[mid]==target) {
				System.out.println("Found at index: "+mid+": "+a[mid]);
				break;
				}
				else if (target>a[mid]) 
					st=mid+1;
				
				else if(target<a[mid])
					end=mid-1;
			}
			if(a[mid]!=target)
				System.out.println("Not Found");
		}
}
