package com.StringProg;

public class Exp {
	public static void main(String[] args) {
		String Name="Kamaljeet";
		String s=Name.toLowerCase();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'
					||s.charAt(i)=='o'||s.charAt(i)=='u') {
							count++;
							System.out.printf("Vowel: %c\n",s.charAt(i));
			}
		}
		System.out.printf("\nFound Total %d Vowels",count);
	}
}