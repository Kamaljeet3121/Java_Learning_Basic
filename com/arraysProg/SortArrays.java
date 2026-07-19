package com.arraysProg;

import java.util.Arrays;

public class SortArrays {
	public static void main(String[] args) {
		int k[]= {10,80,42,18};
		System.out.println(Arrays.toString(sort(k)));
		System.out.println("------------------");
		for(int i:sort(k))System.out.println(i);
}
	public static int[] sort(int[] a) {
		Arrays.sort(a);
		return a;
	}
}
