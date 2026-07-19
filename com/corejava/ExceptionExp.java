package com.corejava;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExp {
	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("Main Started");
		m1();}
	public static void m1() throws FileNotFoundException{
		System.out.println("m1 Started");
		m2();}
	public static void m2() throws FileNotFoundException{
		System.out.println("m2 Started");
		FileReader f=new FileReader("abc.txt");
	}
}
