package com.StringProg;

public class CountCharTypes {
	public static void main(String[] args) {
		String s="Java@!123#";
		int alpha=0,num=0,sp=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='a'&&ch<'z')||(ch>'A'&&ch<'Z'))
				alpha++;
			else if(ch>='0'&&ch<='9')
				num++;
			else 
				sp++;
		}
		System.out.println("Total Alphabets   : "+alpha);
		System.out.println("Total Numebrs     : "+num);
		System.out.println("Total Special Char: "+sp);
	}
}