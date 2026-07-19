package com.numberProg;

public class Exp {
	public static void main(String[] args) {
		int b=1010,deci=0,i=0;
		while(b>0) {
			deci+=(int)Math.pow(2,i)*(b%10);
			i++;
			b/=10;
		}System.out.println(deci);
	}
}
