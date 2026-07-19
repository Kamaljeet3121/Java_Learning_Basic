package com.StringProg;

public class Palindrome {
	public static void main(String[] args) {
		String s1="kamal";
//		for(int i=0;i<s1.length();i++) {
//			if(s1.charAt(i)!=s1.charAt(s1.length()-1-i)) {
//				System.out.println("Not a Palindrome String");
//				break;
//			}else if(i==s1.length()-1) {
//				System.out.println("Palindrome String");
//			}
//		}
//	}
//}
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2+=s1.charAt(i);
		}if(s1.equals(s2)) {
			System.out.println("Palindrome");
		}else
			System.out.println("Not Palindrome");
	}
}

