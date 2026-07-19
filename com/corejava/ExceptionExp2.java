package com.corejava;

public class ExceptionExp2 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		College c=new College("Kamal", "251", "hi");
				c=null;
		try {
			System.out.println(9/0);
		}
		catch (Throwable t) {
			System.out.println("ClassCastException");
		}
		finally {
			System.out.println("finally statement");
		}
	}
}
