package com.StringProg;

import java.util.HashSet;

public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		String s="Banana",newString="";
//		while(s.length()>0) {
//			char ch=s.charAt(0);		//Priority
//			s=s.replace(ch+"", "");
//			newString+=ch;
//		}
//		System.out.println(newString);
//		---------^Replace^---------
//		HashSet<Character> h=new HashSet<>();
//		for(Character ch:s.toCharArray()) {
//			h.add(ch);
//		}
//		System.out.println(h);
		
//		-----------^HashSet^-------------
		
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]&&ch[i]!=Character.MAX_VALUE) {
					ch[j]=Character.MAX_VALUE;
				}
			}if(ch[i]!=Character.MAX_VALUE)
				System.out.println(ch[i]);
		} //Using two LOOPS....
	}
}
