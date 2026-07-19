package com.arraysProg;

import java.util.HashMap;

public class OccuranceInArray {
	public static void main(String[] args) {
		int[] a= {10,20,10,20,30,10,10};
//		for (int i=0;i<a.length;i++) {
//			int count=1;
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]&& a[i]!=Integer.MAX_VALUE) {
//					a[j]=Integer.MAX_VALUE;
//					count++;
//				}
//			}if(a[i]!=Integer.MAX_VALUE)
//					System.out.println(a[i]+"->"+count);
//		}
//	}
//}
//****************
		HashMap<Integer, Integer> h =new HashMap<>();
		for(int i:a) {
//			if(h.containsKey(i))
//				h.put(i, h.get(i)+1); 	//this also works
//			else 
//				h.put(i, 1);
			h.put(i, h.getOrDefault(i, 0)+1);
			
		}System.out.println(h);
	}
}