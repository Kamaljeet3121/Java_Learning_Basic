package com.corejava;

public class Wrapper {
	public static void main(String[] args) {
		int a=45;
		Integer b=55;
		Integer i=Integer.valueOf(a);//static Method
		int j=b.intValue();			 //Non-Static Method
		System.out.println(i+" "+j);
	}
}
