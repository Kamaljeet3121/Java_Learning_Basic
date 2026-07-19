package com.numberProg;
//import java.lang.Math;
public class ArmStrong {
public static void main(String[] args) {
    
	int n=153, temp = n,count=0,s=n;
	while(s>0) {
		s/=10;
		count++;
		}
		s=n;
    	int c =0;
        int sum=0;
        for(int temp2 =s;temp2>=1;temp2=temp2/10){
            c = temp2 % 10;
          int z=1;
          for(int f=1;f<=count;f++) { //we can use d+=((int)Math.pow(c, e)); instead of this loop
            	z*=c;
            }
            sum+=z;
        }
        if(s==sum){
            System.out.println(sum+" is an Armstrong Number");
            }else {
            	System.out.println("Not a Armstrong No.");
            }
}
}
