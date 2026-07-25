package com.StringProg;

public class DistinctWord { //print words occuring once
	public static void main(String[] args) {
		String s="Don't trouble the trouble or trouble will trouble you";
		String[] a=s.split("\s+");
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j])) {
					count++;
					a[j]="";
				}
			}
				if(a[i]!=""&& count==1)
				System.out.println(a[i]+"-->"+count);
		}
	}
}
