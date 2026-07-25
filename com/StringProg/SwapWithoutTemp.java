package com.StringProg;

public class SwapWithoutTemp {
	public static void main(String[] args) {
		String s="JAVA",ss="PROGRAM";
		System.out.println(s+" "+ss);
		s=s+ss;
		ss=s.substring(0,s.length()-ss.length());
		s=s.substring(ss.length());
		System.out.println(s+" "+ss);
	}
}
