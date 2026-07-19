
package com.patternProg;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
//	int n= 5;
//	Scanner in=new Scanner(System.in);
//	System.out.println("Enter the value");
//	n=in.nextInt();
////	System.out.println("-----");
//	for(int row =1;row<=n*2-1;row++) {
//		for(int col=1;col<=n;col++) {
//			if(row>=col&&row+col<=n*2) {
//				System.out.print("* ");
//			}else System.out.print("- ");
//		}System.out.println();
//	}
//	in.close();
//}
//}
//	**************^Right angle pascal triangle^************************
//	int n= 5;
//	Scanner in=new Scanner(System.in);
//	System.out.println("Enter the value");
//	n=in.nextInt();
////	System.out.println("-----");
//	for(int row =1;row<=n*2-1;row++) {
//		for(int col=1;col<=n;col++) {
//			if(row==col||row+col==n*2||col==1) {
//				System.out.print("* ");
//			}else System.out.print("- ");
//		}System.out.println();
//	}
//	in.close();
//}
//}
//***********^Right angle hollow pascal triangle^*****************
//	int n= 5;
//	Scanner in=new Scanner(System.in);
//	System.out.println("Enter the value");
//	n=in.nextInt();
////	System.out.println("-----");
//	for(int row =1;row<=n*2-1;row++) {
//		for(int col=1;col<=n;col++) {
//			if(row<=col||row+col>=n*2) {
//				System.out.print("* ");
//			}else System.out.print("- ");
//		}System.out.println();
//	}
//	in.close();
//}
//}
//************^Right angle complete hollow triangle^***************
//	int n= 5;
//	Scanner in=new Scanner(System.in);
//	System.out.println("Enter the value");
//	n=in.nextInt();
////	System.out.println("-----");
//	for(int row =1;row<=n*2-1;row++) {
//		for(int col=1;col<=n;col++) {
//			if(row==col||row+col==n*2||row==1||row==n*2-1||col==n) {
//				System.out.print("* ");
//			}else System.out.print("- ");
//		}System.out.println();
//	}
//	in.close();
//}
//}
//****************^Hollow of upper one^*******************

//int n= 5;
//Scanner in=new Scanner(System.in);
//System.out.println("Enter the value");
//n=in.nextInt();
//System.out.println("-----");
//for(int row =1;row<=n*2-1;row++) {
//	for(int col=1;col<=n;col++) {
//		if(row+col>=n+1&&row-col<=n-1) {
//			System.out.print("* ");
//		}else System.out.print("- ");
//	}System.out.println();
//}
//in.close();
//}
//}
//**********^left angle pascal triangle^***********
//int n= 5;
//Scanner in=new Scanner(System.in);
//System.out.println("Enter the value");
//n=in.nextInt();
//System.out.println("-----");
//for(int row =1;row<=n*2-1;row++) {
//	for(int col=1;col<=n;col++) {
//		if(row+col==n+1||row-col==n-1||col==n) {
//			System.out.print("* ");
//		}else System.out.print("- ");
//	}System.out.println();
//}
//in.close();
//}
//}
//************^left angle hollow pascal triangle^****************
//int n= 5;
//Scanner in=new Scanner(System.in);
//System.out.println("Enter the value");
//n=in.nextInt();
//System.out.println("-----");
//for(int row =1;row<=n*2-1;row++) {
//	for(int col=1;col<=n;col++) {
//		if(row+col<=n+1||row-col>=n-1) {
//			System.out.print("* ");
//		}else System.out.print("- ");
//	}System.out.println();
//}
//in.close();
//}
//}
//	**************^hOLLOW OF UPPER ONE^******
//	int n= 5;
//	Scanner in=new Scanner(System.in);
//	System.out.println("Enter the value");
//	n=in.nextInt();
//	System.out.println("-----");
//	for(int row =1;row<=n*2-1;row++) {
//		for(int col=1;col<=n;col++) {
//			if(row+col==n+1||row-col==n-1||row==1||row==n*2-1||col==1) {
//				System.out.print("* ");
//			}else System.out.print("- ");
//		}System.out.println();
//	}
//	in.close();
//	}
//	}
//	*************^Reverse^*******************
//	int n= 17;
//	Scanner in=new Scanner(System.in);
////	System.out.println("Enter the value");
////	n=in.nextInt();
////	System.out.println("-----");
//	for(int row =1;row<=n;row++) {
//		for(int col=1;col<=n;col++) {
//			if(row+col>=n/2+2&&row-col<=n/2&&col-row<=n/2&&row+col<=n+1+n/2) {
//				System.out.print("* ");
//			}else System.out.print("  ");
//		}
//				System.out.println();
//	}
//	in.close();
//	}
//	}
//*************up sided Triangle*********************
int n= 5;
Scanner in=new Scanner(System.in);
System.out.println("Enter the value");
n=in.nextInt();
for(int row =1;row<=n;row++) {
	for(int col=1;col<=n*2-1;col++) {
		if(row+col>=n+1&&col-row<=n-1) {
			System.out.print("* ");
		}else System.out.print("- ");
	}System.out.println();
}
in.close();
}
}
//****************up side hollow triangle********
//		int n= 5;
//		Scanner in=new Scanner(System.in);
//		System.out.println("Enter the value");
//		n=in.nextInt();
//		for(int row =1;row<=n;row++) {
//			for(int col=1;col<=n*2-1;col++) {
//				if(row+col==n+1||col-row==n-1||row==n) {
//					System.out.print("* ");
//				}else System.out.print("- ");
//			}System.out.println();
//		}
//		in.close();
//		}
//		}
//		********reverse of upside triangle`*********
//		int n= 5;
//		Scanner in=new Scanner(System.in);
//		System.out.println("Enter the value");
//		n=in.nextInt();
//		for(int row =1;row<=n;row++) {
//			for(int col=1;col<=n*2-1;col++) {
//				if(row+col<=n+1||col-row>=n-1) {
//					System.out.print("* ");
//				}else System.out.print("- ");
//			}System.out.println();
//		}
//		in.close();
//		}
//		}
//		**********reverse of upside but hollow************
//		int n= 5;
//		Scanner in=new Scanner(System.in);
//		System.out.println("Enter the value");
//		n=in.nextInt();
//		for(int row =1;row<=n;row++) {
//			for(int col=1;col<=n*2-1;col++) {
//				if(row==1||col==1||col==n*2-1||row+col==n+1||row+n-1==col) {
//					System.out.print("* ");
//				}else System.out.print("- ");
//			}System.out.println();
//		}
//		in.close();
//		}
//		}








