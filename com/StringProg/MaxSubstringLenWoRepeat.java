package com.StringProg;

import java.util.HashSet;

public class MaxSubstringLenWoRepeat {
	public static void main(String[] args) {
		String s="abdabdc";
//		char[] a=s.toCharArray();
//		int count=0;
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++)
//			if(a[i]==a[j]&&a[i]!=Character.MAX_VALUE) {
//				a[j]=Character.MAX_VALUE;
//			}
//			if(a[i]!=Character.MAX_VALUE) {
//				System.out.print(a[i]);
//					count++;
//			}
//		
//		}System.out.println("\nCount is:"+count);
		
		HashSet<Character> h= new HashSet<>();
		int maxSub=0;
		int left=0;
		for(int r=0;r<s.length();r++) {
			if(h.contains(s.charAt(r))){
				h.remove(s.charAt(left));
				left++;
			}
			h.add(s.charAt(r));
			maxSub=Math.max(maxSub, r-left+1);
		}
		System.out.println(maxSub);
		
		
		
		
		
		
		
		
	}
}
