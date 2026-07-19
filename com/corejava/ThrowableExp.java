package com.corejava;

public class ThrowableExp {
		public static void main(String[] args) {

			String s="";
			System.out.println(s);
			try{
				System.out.println(s.charAt(10));
			}
			catch(StringIndexOutOfBoundsException ss) {
				ss.printStackTrace();
			}
			System.out.println("bye..");
		
		}
}
