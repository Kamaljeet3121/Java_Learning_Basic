package com.StringProg;

import java.util.HashMap;

public class OccurenceOfEachChar {
	public static void main(String[] args) {
		String s="Banana";
		while (s.length()>0) {
			char ch=s.charAt(0);
			String s2=s.replace(ch+"", "");
			int count=s.length()-s2.length();
			System.out.println(ch+"-->"+count);
			s=s2;
		}
		
		
//		---------^Replace Method^-----------------
//		char[] a=s.toCharArray();
//		for(int i=0;i<a.length;i++) {
//			int count=1;
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					count++;
//					a[j]=Character.MAX_VALUE;
//				}
//			}
//			if(a[i]!=Character.MAX_VALUE)
//				System.out.println(a[i]+"->"+count);
//	}
//		---------------^Two Loops^-------------------
//			HashMap <Character,Integer> h=new HashMap<>();
//			for(Character ch:s.toCharArray()) {
//				if(h.containsKey(ch))
//					h.put(ch, h.get(ch)+1);
//				else
//					h.put(ch, 1);		
//			}
//			System.out.println(h);
	}
}