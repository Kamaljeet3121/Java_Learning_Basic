package com.StringProg;

//import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String s="aab",ss="bba";
		boolean check=true;
		if(s.length()==ss.length()) {
		for(int i=0;i<s.length();i++) {
				if(check) {
					for(int j=0;j<ss.length();j++) {
						if(s.charAt(i)==ss.charAt(j)) {
							ss = ss.substring(0, j) + ss.substring(j + 1);
							check=true;
							break;
						}
						else
							check=false;
					}
				}
		}
		if(check)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
		}
		else
			System.out.println("Not Anagram");
		
//		----^Two Loops Method^---------
		
		
		
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
