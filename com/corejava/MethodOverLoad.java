package com.corejava;

public class MethodOverLoad {
	public static void main(String[] args) {
		m1(23,"gopu");
		m1("gopuu",5987);
		m1(54,"suman",true);
		add(23,45);
		add(54,98,753);
		add(9898,874512,548);
		add(9,8,7,66585);
		
	}
	
	public static void m1(int a,String b) {
		System.out.println(a+b);
	}
	public static void m1(String a, int b) {
		System.out.println(a+b);
	}
	public static void m1(int a,String b,boolean c) {
		System.out.println(a+b+c);
	}
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void add(int a,int b,int c,int d) {
		System.out.println(a+b+c+d);
	}

}
