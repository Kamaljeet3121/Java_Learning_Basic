package com.StringProg;

public class ConvertLowerToUpper {
	public static void main(String[] args) {
		String s="Kamaljeet",res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z')
				res+=(char)(ch-32);
			else 
				res+=ch;
		}System.out.println(res);
	}
}