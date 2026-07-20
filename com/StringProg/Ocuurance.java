package com.StringProg;

public class Ocuurance {
	public static void main(String[] args) {
		String s= "Hello";
		char ch[]=s.toCharArray();
		for(int a=0;a<ch.length;a++) {
			int c=1;
			for(int b=a+1;b<ch.length;b++) {
				if(ch[a]==ch[b]&&ch[a]!=' ') {
					c++;
					ch[b]=' ';
				}
			}if(ch[a]!=' ')
				System.out.println(ch[a]+"-> "+c);
		}
				for(int i=0;i<s.length();i++) {
					boolean a=false;
					for(int k=0;k<i;k++) {
						if(s.charAt(k)==s.charAt(i)) {
							a=true;
							break;
						}
					}
					if(!a) {
					int count=1;
					for(int j=i+1;j<s.length();j++) {
						if(s.charAt(i)==s.charAt(j)) {
							count++;
						}
					}
				System.out.println(s.charAt(i)+"->"+count);
				}
		}
	}
}
