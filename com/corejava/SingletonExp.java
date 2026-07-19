package com.corejava;

public class SingletonExp {
	private static SingletonExp s;
	static int kam=25;
	int [] arr;
	int id;
	String name;
	int age;
	
	private SingletonExp(int a,int b,String name) {
		this.id=a;
		this.age=b;
		this.name=name;
	}
	public static SingletonExp getObject(int a,int b,String name) {
		if(s==null) {
			s=new SingletonExp(a,b,name);
			return s;
		}
		else 
		return s;
	}
}
