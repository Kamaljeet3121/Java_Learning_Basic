package com.StringProg;

public class ReverseEachWordAlongWithSentence {
	public static void main(String[] args) {
		String s="Java is an Oop Lang";
//		String[] a=s.split(" ");
//		String rev="";
//		for(int i=0;i<a.length;i++) {
//			for(int j=a[i].length()-1;j>=0;j--) {
//				rev+=a[i].charAt(j);
//			}rev+=" ";
//		}
//		rev=rev.trim();
//		System.out.println(rev);
		
		
		s+=" ";		//without using Split 
		String rev=" ";
		int st=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				for(int j=i-1;j>=st;j--) {
					rev+=s.charAt(j);
				}rev+=" ";
				st=i+1;
			}
		}rev=rev.trim();
			System.out.println(rev);
	}
}
