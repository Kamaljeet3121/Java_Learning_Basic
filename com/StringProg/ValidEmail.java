package com.StringProg;

public class ValidEmail {
	public static void main(String[] args) {
		String e="kamaljeet3121@gmail.com";
		
		System.out.println(isValidEmail(e));
	}

	public static boolean isValidEmail(String e) {
		return e.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
	}
}
