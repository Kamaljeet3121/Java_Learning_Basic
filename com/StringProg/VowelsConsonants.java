package com.StringProg;

public class VowelsConsonants {
	public static void main(String[] args) {
		String name="Kamaljeet",s=name.toLowerCase();
		int vowC=0,consC=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				System.out.println(s.charAt(i)+"-->Vowel");
				vowC++;
			}
			else {
				System.out.println(s.charAt(i)+"-->Consonant");
				consC++;
			}
		}
		System.out.println("\nTotal Vowels    -> "+vowC);
		System.out.println("Total Consonants-> "+consC);
	}
}
