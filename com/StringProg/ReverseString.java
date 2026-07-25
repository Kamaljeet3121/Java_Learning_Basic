package com.StringProg;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {
		String s="JAVA Praogram",ss="";
//		for(int i=s.length()-1;i>=0;i--)
//			ss+=s.charAt(i);
//		System.out.println(ss);
		
		char[] c=s.toCharArray();
		int st=0,end=c.length-1;
		while (st<end) {
			char temp=c[st];
			c[st]=c[end];
			c[end]=temp;
			st++;
			end--;
			
		}System.out.println(Arrays.toString(c));
	}
}
