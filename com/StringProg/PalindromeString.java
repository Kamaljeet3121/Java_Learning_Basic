package com.StringProg;

public class PalindromeString {
	public static void main(String[] args) {
		String s="malayalam";
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				System.out.println("Not Palindrome");
				break;
			}
			else if(i==(s.length()/2)-1)
				System.out.println("Palindrome");
		}
	}
}
