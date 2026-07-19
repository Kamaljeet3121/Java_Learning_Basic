package com.StringProg;

public class Reverse {
	public static void main(String[] args) {
		String s1="JAVA",s2="";
		for(int i=0;i<s1.length();i++) {
			s2+=s1.charAt(s1.length()-1-i);
		}System.out.println(s2);
	}
}
