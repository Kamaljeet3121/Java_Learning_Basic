package com.arraysProg;

//import java.util.Arrays;

public class MaxElement {
	public static void main(String[] args) {
//		int[] a= {10,15,2,3,4,36};
//		int max=a[0];
//		for(int i=1;i<a.length;i++) {
//			if(a[i]>max)
//			max=a[i];
//			}System.out.println(max);  
//	}}
//******************Max Valur**************************
//		int[] a= {10,15,2,3,4,36};
//		int min=a[0];
//		for(int i=1;i<a.length;i++) {
//			if(a[i]<min)
//			min=a[i];
//			}System.out.println(min);  
//	}}
//	***************Min Valur********************
// 	 	int[] a= {15,16,7,2,36,8};
//		int max=a[0],max2=a[0];
//		for(int i=1;i<a.length;i++) {
//			if(a[i]>max) {
//				max2=max;
//				max=a[i];
//			}
//		else if(a[i]>max2&&a[i]!=max) {
//				max2=a[i];
//		}}
//		 System.out.println(max2+" "+max);
//	}}
//*****************2nd Maximum****************
//		int[] a= {16,15,7,2,36,8};
//		int min=a[0],min2=a[0];
//		for(int i=1;i<a.length;i++) {
//			if(a[i]<min) {
//				min2=min;
//				min=a[i];
//			}
//		else if(a[i]<min2&&a[i]!=min) {
//				min2=a[i];
//		}}
//		 System.out.println(min2+" "+min);
//		}
//		}	
//**************2nd Min****************
//	int[] a= {15,16,3,45,35,2,36,8};
//	int max=a[0],max2=a[0],max3=a[0];
//	for(int i=1;i<a.length;i++) {
//		if(a[i]>max) {
//			max3=max2;
//			max2=max;
//			max=a[i];
//		}
//	else if(a[i]>max2&&a[i]!=max) {
//			max3=max2;
//			max2=a[i];
//	}
//	else if(a[i]>max3&&a[i]!=max&&a[i]!=max2) {
//		max3=a[i];
//	}
//		}
//	 System.out.println("1st Max: "+max+"\n2nd Max: "+max2+"\n3rd Max: "+max3);
//	}
//	}
//**************3rd max****************
	int[] a= {15,16,3,45,35,2,36,8};
	int min=a[0],min2=a[0],min3=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]<min) {
			min3=min2;
			min2=min;
			min=a[i];
		}
		else if(a[i]<min2&&a[i]!=min) {
			min3=min2;
			min2=a[i];
		}
		else if(a[i]<min3&&a[i]!=min&&a[i]!=min2) {
		min3=a[i];
		}
		}
	 System.out.println("1st Min: "+min+"\n2nd Min: "+min2+"\n3rd Min: "+min3+"\n----------");
	}
	}
//*******************3rd min***************	
		
	
	
	
	
	