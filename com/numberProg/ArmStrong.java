package com.numberProg;
//import java.lang.Math;
public class ArmStrong {
public static void main(String[] args) {
    
	int a=153, temp = a,count=0,s=a;
	while(s>0) {
		s/=10;
		count++;
		
	}
    	int c =0;
        int d=0;
        for(int temp2 =temp;temp2>=1;temp2=temp2/10){
            c = temp2 % 10;
            int e=count;
          int z=1;
          for(int f=1;f<=e;f++) { //we can use d+=((int)Math.pow(c, e)); instead of this loop
            	z*=c;
            }
            d=d+z;
        }
        if(temp==d){
            System.out.println(d+" is an Armstrong Number");
            }else {
            	System.out.println("Not a Armstrong No.");
            }
}
}
