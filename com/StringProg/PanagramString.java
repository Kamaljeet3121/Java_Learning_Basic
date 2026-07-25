package com.StringProg;

public class PanagramString { //all alphabets should be present in String
	public static void main(String[] args) {
		String s="The Quick Brown Fox Jumps over the Lazy Dog";
		s=s.toLowerCase();
		for(char c='a';c<='z';c++) {
			if(s.indexOf(c)==-1) {
				System.out.println("Not a Panagram");
				break;
			}
			else if(c=='z')
				System.out.println("Panagram");
		}
	}
}