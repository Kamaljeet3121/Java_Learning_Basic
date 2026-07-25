package com.StringProg;

public class ConvertUpperToLower {
	public static void main(String[] args) {
		String s="Kamaljeet", res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z')
				res+=(char)(ch+32);
			else 
				res+=ch;
		}System.out.println(res);
	}
}