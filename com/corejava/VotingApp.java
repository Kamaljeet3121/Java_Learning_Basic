package com.corejava;
import java.util.Scanner;

class AgeInvalidException extends RuntimeException{
	public String getMessage() {
		return "Improper Human Found-- (Probably Aliens)";
	}}
public class VotingApp {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age=in.nextInt();
		if(age>18&&age<100) {
			System.out.println("Proper Humans");
		}else {
			try {
				throw new AgeInvalidException();
			}
			catch(AgeInvalidException a){
				System.out.println(a.getMessage());
			}
		}in.close();
	}
}