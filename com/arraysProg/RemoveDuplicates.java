package com.arraysProg;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] a = {10,20,10,30,20,10};
		for(int k=0;k<a.length;k++)
		for(int i=k+1;i<a.length;i++)
			if(a[k]==a[i]&&a[i]!=Integer.MAX_VALUE)
				a[i]=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=Integer.MAX_VALUE)
				System.out.print(a[i]+" ");
		}
//	*****************after storing in another array************************	

//				int[] a = {10,20,10,30,20,10};
//				int count =0,index=0;
//				for(int k=0;k<a.length;k++)
//				for(int i=k+1;i<a.length;i++)
//					if(a[k]==a[i]&&a[i]!=Integer.MAX_VALUE){
//						a[i]=Integer.MAX_VALUE;
//						count++;}
//				
//				int[] b=new int[a.length-count];
//				for(int i=0;i<a.length;i++) 
//					if(a[i]!=Integer.MAX_VALUE)
//						b[index++]=a[i];
//				
//				System.out.println(Arrays.toString(b));
//				}}
// ****************HashSet********************
//			int[] a = {10,20,10,30,20,10};
////			HashSet<Integer> h =new HashSet<>();
////			for(int i:a) {
////				h.add(i);
////			}System.out.println(h);
////	}}
////***************************
//			int [] uni=Arrays.stream(a).distinct().toArray();
//			System.out.println(Arrays.toString(uni));
	}}





