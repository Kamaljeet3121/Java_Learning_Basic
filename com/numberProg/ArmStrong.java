package com.numberProg;

import java.util.Scanner;

//import java.lang.Math;
public class ArmStrong {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int input=in.nextInt(),count=0,check=input;
	while(input>0) {
		input/=10;
		count++;
		}
		input=check;
        int sum=0;
        while(input>0){
          int pow=1;
          for(int f=1;f<=count;f++) { //we can use d+=((int)Math.pow(check%10, count));
            	pow*=input%10;
            }
            sum+=pow;
            input/=10;
        }
        if(check==sum)
        		System.out.println(sum+" is an Armstrong Number");
            else 
            	System.out.println("Not a Armstrong No.");
        in.close();
	}
}
