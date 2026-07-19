package com.patternProg;

public class PattAssignment {
	public static void main(String[] args) {
//	int n=3;
//	for(int row=1;row<=n;row++) {
//		char k='a';
//		for(int col=1;col<=n*2-1;col++) {
//			if(row+col>=n+1&&row+n-1>=col) {
//				System.out.print(k+" ");
//				k++;
//				}
//			else 
//				System.out.print("- ");
//		}System.out.println();
//	}
//	}
//}
//**********************************************************
//int n=3;
//for(int row=1;row<=n;row++) {
//	for(int col=1;col<=n*2-1;col++) {
//		if(row+col>=n+1&&row+n-1>=col) {
//			if(row%2!=0) {
//			System.out.print("1 ");}
//			else {System.out.print("0 ");}
//			}
//		else 
//			System.out.print("- ");
//	}
//	System.out.println();
//}
//}
//}
//***************************************
//int n=3,k=1;
//for(int row=1;row<=n;row++) {
//	for(int col=1;col<=n*2-1;col++) {
//		if(row+col>=n+1&&row+n-1>=col) {
//			System.out.print(k+" ");
//			k++;
//		}	
//		else 
//			System.out.print("- ");
//		}
//		System.out.println();
//		}
//}
//}
//*******************************************
//int n=3,k=1;
//for(int row=1;row<=n;row++) {
//	for(int col=1;col<=n*2-1;col++) {
//		if(row+col>=n+1&&row+n-1>=col) {
//			System.out.print(k+" ");
//			k++;
//		}	
//		else 
//			System.out.print("- ");
//		}
//		System.out.println();
//		}
//}
//}
//****************************************
//		int n=5;
//		for(int row=1;row<=n;row++) {
//			int k=1;
//			for(int col=1;col<=n*2-1;col++) {
//				if(row+col>=n+1&&row+n-1>=col) {
//					System.out.print(k+" ");
//					if(col<n)
//						k++;
//					else k--;
//				}	
//				else 
//					System.out.print("- ");
//				}
//				System.out.println();
//				}
//		}
//		}	
//**********************************
//		int n=5;
//		for(int row=1;row<=n;row++) {
//			int k=row;
//			for(int col=1;col<=n*2-1;col++) {
//				if(row+col>=n+1&&row+n-1>=col) {
//					System.out.print(k+" ");
//					k=col<n?k-1:k+1;
//				}	
//				else 
//					System.out.print("- ");
//				}
//				System.out.println();
//				}
//		}
//		}	
//		*****************************
		int n=5;
		for(int row=1;row<=n*2-1;row++) {
			int k=row<=n?row:n*2-row;
			for(int col=1;col<=n*2-1;col++) {
				if(row+col>=n+1&&row+n-1>=col&&row<=col+n-1&&row+col<=n*3-1) {
					System.out.print(k+" ");
					k=col<n?k-1:k+1;
				}	
				else 
					System.out.print("- ");
				}
				System.out.println();
				}
		}
		}	
//*******************************************
//int n=5;
//for(int row=1;row<=n*2-1;row++) {
//	int k=1;
//	for(int col=1;col<=n*2-1;col++) {
//		if(row+col>=n+1&&row+n-1>=col&&row<=col+n-1&&row+col<=n*3-1) {
//			System.out.print(k+" ");
//			k=col<n?k+1:k-1;
//		}	
//		else 
//			System.out.print("- ");
//		}
//		System.out.println();
//		}
//}
//}	
//**********************************?
//		int n=3;
//int a;
//for(int row=-n;row<=n;row++) {
//	a=row;
//	if(a<=0)
//		a=-a;
//	for(int col=-n;col<=n;col++) {
//		int b=col;
//		if(b<=0)
//		b=(-b);
//		if(a+b<=n)
//			System.out.print(b+1+" ");
//		else 
//			System.out.print("- ");
//	}System.out.println();
//}
//}
//}
























