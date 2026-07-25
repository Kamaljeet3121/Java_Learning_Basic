package com.StringProg;

public class RemoveDigitsSpChar {
	public static void main(String[] args) {
		String s="Java@123!#",rev="";
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='a'&&ch<'z')||(ch>'A'&&ch<'Z'))
				rev+=s.charAt(i);
		}System.out.println(rev);
	}
}
