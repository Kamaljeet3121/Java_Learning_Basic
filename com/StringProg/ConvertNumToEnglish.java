package com.StringProg;

import java.util.Scanner;

public class ConvertNumToEnglish {
	public static void main(String[] args) {
		String[] ones= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
						"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen",
						"Eighteen","Nineteen"};
		String[] Tens= {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		
		String[] thousands= {"","Thousand","Million","Billion"};
		
		Scanner inp= new Scanner(System.in);
		System.out.println("Enter The Number:");
		int n=inp.nextInt();
		if(n==0)
			System.out.println("Zero");
		else {
			StringBuffer res=new StringBuffer();
			int index=0;
				while(n>0) {
					StringBuffer temp=new StringBuffer();
					System.out.println("-");
					int part=n%1000;
					if(part!=0) {
						if(part>=100) {
						temp.append(ones[part/100]).append(" Hundred ");
						part%=100;
					}
						if(part>=20) {
						temp.append(Tens[part/10]).append(" ");
						part%=10;
					}
						if(part>0) {
						temp.append(ones[part]).append(" ");
					}
						}
					temp.append(thousands[index]).append(" ");
					res.insert(0, temp);
					index++;
					n/=1000;
			}
				System.out.println(res.toString());	
		}
	}
}
