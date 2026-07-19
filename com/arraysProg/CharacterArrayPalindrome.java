package com.arraysProg;

public class CharacterArrayPalindrome {
	public static void main(String[] args) {
		char[] ch= {'k','a','m','a','k'};
//		System.out.println(isPalindrome(ch));
//	}
//
//	public static String isPalindrome(char[] ch) {
//		int st=0,end=ch.length-1;
//		while(st>end) {
//			if(ch[st]!=ch[end]) {
//				return "Array Not Palindrome";
//			}else {
//				st++;
//				end--;
//			}
//		}return "Array is Palindrome";
//		************************
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=ch[ch.length-i-1]) {
				System.out.println("Not Palindrome");
				break;
			}else if(i==ch.length-1)
		System.out.println("palindrome");
		}
	}
}
