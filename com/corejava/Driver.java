package com.corejava;

public class Driver {

	public static void main(String[] args) {
		SingletonExp s1=SingletonExp.getObject(15,25,"Maaz");
		System.out.println(s1);
		System.out.println(s1.id);
		System.out.println(s1.age);
		System.out.println(s1.name);
		s1.name="SumanSarkar";
		System.out.println(s1.name);
//		SingletonExp.s=null;++
		SingletonExp s2=SingletonExp.getObject(84052,29,"Kamal");
		System.out.println(s2.age);
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s1.name);
		System.out.println(s2.kam);
		s2.arr=new int[5];
		s2.arr[0]=25015;
		System.out.println(s2.arr[0]);

		

		
	}
	}
