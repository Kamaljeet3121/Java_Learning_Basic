package com.arraysProg;
import java.util.Arrays;

public class RemoveElementInArray {
	public static void main(String[] args) {
		int[] a= {2,10,20,50,60};
		int index=3,j=0;
		int[] b=new int[a.length-1];
		for(int i=0;i<a.length;i++) {
			if(i==index)
				continue;
			b[j]=a[i];
			j++;			
		}System.out.println(Arrays.toString(b));
	}
}