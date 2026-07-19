package com.corejava;

import java.util.Scanner;

public class Super_Statement {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("---Enter-College-Name-----");
		String a=in.next();
		System.out.println("---Enter-College-Code-----");
		String b=in.next();
		System.out.println("---Enter-College-Address--");
		String c=in.next();
		System.out.println("---Enter-Student-Name-----");
		String d=in.next();
		System.out.println("---Enter-Student-Id-------");
		int e=in.nextInt();
		System.out.println("---Enter-Student-age------");
		int f =in.nextInt();
		Student s1=new Student(a,b,c,d,e,f);
		s1.display();
		in.close();
	}
}
