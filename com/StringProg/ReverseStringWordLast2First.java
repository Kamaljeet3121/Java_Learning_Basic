package com.StringProg;

public class ReverseStringWordLast2First {
	public static void main(String[] args) {
		String s ="Java is an Oop Lang",rev="";
		String[] ss=s.split(" ");
		for(int i=ss.length-1;i>=0;i--) {
			rev+=ss[i]+" ";
		}
		rev=rev.trim();
		System.out.println(rev);
	}
}