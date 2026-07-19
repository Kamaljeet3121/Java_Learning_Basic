package com.numberProg;

public class Pattern4 {
	public static void main(String[] args) {
//	int n=5;
//	for(int row=1;row<=n*2-1;row++) {
//		for(int col=1;col<=n*2-1;col++) {
//			if(row>=col&&row+col<=2*n||row+col>=n*2&&row<=col)
//				System.out.print("* ");
//			else 
//				System.out.print("  ");
//		}System.out.println();
//	}
//	}
//}
//******************^Butterfly Program^***************
//		int n=7;
//		for(int row=1;row<=n*2-1;row++) {
//			for(int col=1;col<=n*2-1;col++) {
//				if(row==col||row+col==2*n||col==1||col==2*n-1)
//					System.out.print("* ");
//				else 
//					System.out.print("  ");
//			}System.out.println();
//		}
//		}
//	}
//******************^Hollow Butterfly Program^***************
//		int n=3;
//		for(int row=1;row<=n*2-1;row++) {
//			for(int col=1;col<=n*2-1;col++) {
//				if(row<=col&&row+col<=2*n||row>=col&&row+col>=2*n)
//					System.out.print("* ");
//				else 
//					System.out.print("- ");
//			}System.out.println();
//		}
//		}
//	}
//		*************^Hour glass^***********************
//		int n=5;
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n*2-1;col++) {
//				if(row<=col&&row+col<=n*2)
//					System.out.print("* ");
//				else 
//					System.out.print("- ");
//			}System.out.println();
//		}
//		}
//	}
//		******************downside pascal triangle****************
//		int n=5;
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n*2-1;col++) {
//				if(row==col||row+col==n*2||row==1)
//					System.out.print("* ");
//				else 
//					System.out.print("- ");
//			}System.out.println();
//		}
//		}
//	}
//***************down side hollow triangle*******************
//		int n=5;
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n*2-1;col++) {
//				if(row>=col||row+col>=n*2)
//					System.out.print("* ");
//				else 
//					System.out.print("- ");
//			}System.out.println();
//		}
//		}
//	}
		//**********opp of downside pascal triangle********************
//		int n=5;
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n*2-1;col++) {
//				if(row==col||row+col==n*2||row==n||col==1||col==2*n-1)
//					System.out.print("* ");
//				else 
//					System.out.print("- ");
//			}System.out.println();
//		}
//		}
//	}
		//************opp of downside but hollow pascal triangle*******
//		int n=9;
//		for(int row=1;row<=n*2-1;row++) {
//			for(int col=1;col<=n*2-1;col++) {
//				if(row+col>=n+1&&row+n-1>=col&&row<=col+n-1&&row+col<=3*n-1)
//					System.out.print("* ");
//				else 
//					System.out.print("- ");
//			}System.out.println();
//		}
//		}
//	}
//************Diamond pattern**********
//		int n=9;
//		for(int row=1;row<=n*2-1;row++) {
//			for(int col=1;col<=n*2-1;col++) {
//				if(row+col==n+1||row+n-1==col||row==col+n-1||row+col==3*n-1)
//					System.out.print("* ");
//				else 
//					System.out.print("- ");
//			}System.out.println();
//		}
//		}
//	}
//******************hollow diamond pattern******************
//		int n=7;
//		for(int row=1;row<=n*2-1;row++) {
//			for(int col=1;col<=n*2-1;col++) {
//				if(row+col<=n+1||row+n-1<=col||row>=col+n-1||row+col>=3*n-1)
//					System.out.print("* ");
//				else 
//					System.out.print("  ");
//			}System.out.println();
//		}
//		}
//	}
//*******************opp to diamond pattern**************
//		int n=11;
//		for(int row=1;row<=n*2-1;row++) {
//			for(int col=1;col<=n*2-1;col++) {
//				if(row<=col&&row+col<=n*2||row+col>=n*2&&row>=col)
//					System.out.print("* ");
//				else 
//					System.out.print("  ");
//			}System.out.println();
//		}
//		}
//	}
//******************Hour glass pattern***********************
//		int n=11;
//		for(int row=1;row<=n*2-1;row++) {
//			for(int col=1;col<=n*2-1;col++) {
//				if(row==col||row+col==n*2||row==2*n-1||row==1)
//					System.out.print("* ");
//				else 
//					System.out.print("  ");
//			}System.out.println();
//		}
//		}
//	}
		//*******************
		int n=4;
		int a;
		for(int row=(-n)+1;row<n;row++) {
			a=row;
			if(a<=0)
				a=-a;
			a=a-(n-1);
			if(a<0)
				a=-a;
			for(int col=(-n)+1;col<n;col++) {
				int b=col;
				if(b<=0)
				b=(-b);
				if(a>=b)
					System.out.print(b+1+" ");
				else 
					System.out.print("  ");
			}System.out.println();
		}
		}
	}
//*****************************************************
//		int n=7;
//		int a;
//		for(int row=(-n)+1;row<n;row++) {
//			a=row;
//			if(a<=0)
//				a=-a;
//			for(int col=(-n)+1;col<n;col++) {
//				int b=col;
//				if(b<=0)
//				b=(-b);
//				if(a+b<=n-1)
//					System.out.print(b+" ");
//				else 
//					System.out.print("- ");
//			}System.out.println();
//		}
//		}
//	}
//		**************************
//		















