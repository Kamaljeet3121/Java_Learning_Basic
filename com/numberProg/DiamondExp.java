package com.numberProg;
public class DiamondExp {
public static void main(String[] args) {
//	int n=3;
//	for(int row=-n;row<=n;row++) {
//		int a=row>=0?row:-row;
//		for(int col=-n;col<=n;col++) {
//			int b=col>=0?col:-col;
//			if(a+b<=n)
//				System.out.print("* ");
//			else
//				System.out.print("  ");
//		}System.out.println();
//	}
//}
//}
//	***************************************
	int n=3;
	for(int row=-n;row<=n;row++) {
		int a=row>=0?row:-row;
		for(int col=-n;col<=n;col++) {
			int b=col>=0?col:-col;
			if(a+b==n)
				System.out.print("* ");
			else
				System.out.print("  ");
		}System.out.println();
	}
}
}