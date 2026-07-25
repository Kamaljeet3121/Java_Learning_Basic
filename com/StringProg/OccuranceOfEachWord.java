package com.StringProg;

import java.util.HashMap;

public class OccuranceOfEachWord {

	public static void main(String[] args) {
		String s="dont trouble the trouble or trouble will trouble you";
//		HashMap <String,Integer> h=new HashMap<>();
//		for(String key: s.split("\s+")) {
//			if(h.containsKey(key))
//				h.put(key, h.get(key)+1);
//			else 
//				h.put(key, 1);
//		}
//		System.out.println(h);
		
//		---------Using hashmap-------------
		String[] a=s.split("\s+");
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j])) {
					count++;
					a[j]="";
				}
			}
				if(a[i]!="")
				System.out.println(a[i]+"-->"+count);
		}
	}

}
