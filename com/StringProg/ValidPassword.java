package com.StringProg;

public class ValidPassword {
	public static void main(String[] args) {
		String p="Adarsh@091";
		System.out.println(isValidPassword(p));
	}

	public static boolean isValidPassword(String p) {
		if(p.contains(" "))
			return false;
		if(p.length()<8 || p.length()>15)
			return false;
			
		if(!p.matches(".*[a-z].*"))
			return false;
		
		if(!p.matches(".*[A-Z].*"))
			return false;
		
		if(!p.matches(".*[0-9].*"))
			return false;
		
		if(!p.matches(".*[!@#$%^&+-].*"))
			return false;
			
		return true;
	}
}
