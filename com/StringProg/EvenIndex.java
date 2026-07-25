package com.StringProg;

public class EvenIndex {
	public static void main(String[] args) {
		String s="Kamaljeet";
		for(int i=0;i<s.length();i++) {
			if(i%2==0)
				System.out.println(i+" index-> "+s.charAt(i));
		}
	}
}
