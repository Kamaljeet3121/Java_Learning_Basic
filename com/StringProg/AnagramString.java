package com.StringProg;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String s="silent",ss="listen";
		boolean p=false;
		if(s.length()==ss.length()) {
			for(int i=0;i<s.length();i++) {
				p=true;
					if(p) {
						for(int j=0;j<s.length();j++) {
							if(s.charAt(i)!=s.charAt(j)) {
								p=false;
							}else {
								p=true;
								break;
							}
								
					}
				}else
					break;		
			}
			if(p)
				System.out.println("Anagram");
			else
				System.out.println("Not Anagram");
		}
		else
			System.out.println("Not Anagram");
		
		
		
		
		
		
//		if(s.length()!=ss.length())
//			System.out.println("Not Anagram");
//		else {
//			s=s.toLowerCase();
//			ss=ss.toLowerCase();
//			char[] c=s.toCharArray();
//			char[] cc=ss.toCharArray();
//			Arrays.sort(c);
//			Arrays.sort(cc);
//			if(Arrays.equals(c, cc))
//				System.out.println("Anagram");
//			else
//				System.out.println("Not Anagram");
//		}
	}
}
