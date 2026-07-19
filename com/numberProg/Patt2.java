package com.numberProg;
import java.util.Scanner;
public class Patt2 {
	public static void main(String[] args) {
//  ********************middle row as star****************
//		int n=7;
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n;col++) {
//				if(row==(n/2)+1) {
//					System.out.print("* ");
//				}else
//					System.out.print("- ");
//				}System.out.println();
//			}
//		}
//	}
//  ********************middle col as star **************
//		int n=7;
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n;col++) {
//				if(col==(n/2)+1) {
//					System.out.print("* ");
//				}else
//					System.out.print("- ");
//				}System.out.println();
//			}
//		}
//	}
//  *******************plus pattern********************
//		int n=7;
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n;col++) {
//				if(row==(n/2)+1||col==(n/2)+1) {
//					System.out.print("* ");
//				}else
//					System.out.print("- ");
//				}System.out.println();
//			}
//		}
//	}
//  ***********************diagonal pattern(Primary)*********************
//  int n=7;
//  for(int row=1;row<=n;row++) {
//	for(int col=1;col<=n;col++) {
//		if(col==row) {
//			System.out.print("* ");
//		}else
//			System.out.print("- ");
//		}System.out.println();
//	}
//}
//}
//  ************************diagonal pattern(Secondary)******************
//		int n=7;
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n;col++) {
//				if(col==n-row+1) {//we can use an alternative
//				if(col+row==n+1) {
//					System.out.print("* ");
//				}else
//					System.out.print("- ");
//				}System.out.println();
//			}
//		}
//		}
//  ******************X pattern**************************
//		int n=9;
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n;col++) {
//				if(col+row==n+1||col==row) {
//					System.out.print("* ");
//				}else
//					System.out.print("- ");
//				}System.out.println();
//			}
//		}
//		}
//  ******************L-Pattern*************************
//		int n=9;
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n;col++) {
//				if(row==n||col==1) {
//					System.out.print("* ");
//				}else
//					System.out.print("- ");
//				}System.out.println();
//			}
//		}
//		}
//  ********************Z=Pattern****************************
//		Scanner in=new Scanner(System.in);
//		int n=in.nextInt();
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n;col++) {
//				if(row==1||row==n||row+col==n+1) {
//					System.out.print("* ");
//				}else
//					System.out.print("- ");
//				}System.out.println();
//			}
//		}
//		}
//  ************************T-Pattern********************
//  Scanner in=new Scanner(System.in);
//  System.out.println("Enter the Size:");
//  int n=in.nextInt();
//  for(int row=1;row<=n;row++) {
//	for(int col=1;col<=n;col++) {
//		if(row==1||col==(n/2+1)) {
//			System.out.print("* ");
//		}else
//			System.out.print("- ");
//		}System.out.println();
//	}
//}
//}
//  *****************I-Pattern*************************
//  Scanner in=new Scanner(System.in);
//  System.out.println("Enter the Size:");
//  int n=in.nextInt();
//  for(int row=1;row<=n;row++) {
//	for(int col=1;col<=n;col++) {
//		if(row==1||col==(n/2)+1||row==n) {
//			System.out.print("* ");
//		}else
//			System.out.print("- ");...
//		}System.out.println();
//	}
//}
//}
//  **********************E-Pattern********************
//		Scanner in=new Scanner(System.in);
//		System.out.println("Enter the Size:");
//		int n=in.nextInt();
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n;col++) {
//				if(row==1||row==n||row==(n/2)+1||col==1) {
//					System.out.print("* ");
//				}else
//					System.out.print("- ");
//				}System.out.println();
//			}
//		in.close();
//		}
//		}
//  *****************unsolve-Pattern***************************
//  Scanner in=new Scanner(System.in);
//  System.out.println("Enter the Size:");
//		int n=7;
//  int n=in.nextInt();
//  for(int row=1;row<=n;row++) {
//	for(int col=1;col<=n;col++) {
//		if(col==1||col+row==n-1||row==col+2) {
//			System.out.print("* ");
//		}else
//			System.out.print("- ");
//		}System.out.println();
//	}
//  in.close();
//  ********************K pattern-exp********************
//  int n=17;
//  int n=in.nextInt();
//  for(int row=1;row<=n;row++) {
//	for(int col=1;col<=n;col++) {
//		if(col==1||row==col+n/2||(row-1+col)*2==n+1) 
//			System.out.print("* ");
//		else System.out.print("- ");
//		
//			}
//	System.out.println();
//		}
//	}
//}
//  *********************K-Pattern**********************
//		int n=7;
//		Scanner in=new Scanner(System.in);
//		System.out.println("Enter the size of table:");
//		 n=in.nextInt();
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n;col++) {
//				if(col==1||row==col+n/2||row+col==n-n/2+1) 
//					System.out.print("* ");
//				else System.out.print("- ");
//				
//					}
//			System.out.println();
//				}
//			}
//		}
//  *******************Square******************************/
//  int n=7;
//  Scanner in=new Scanner(System.in);
//  System.out.println("Enter the size of table:");
//  n=in.nextInt();
//  for(int row=1;row<=n;row++) {
//	for(int col=1;col<=n;col++) {
//		if(col==1&&row<=n/2||row==n/2+1||col==n&&row>n/2||row==1||row==n)
//					System.out.print("* ");
//		else	System.out.print("- ");
//			}
//	System.out.println();
//		}
//	}
//}
//  ************accending descending*****************
//  int n=9;
//  Scanner in=new Scanner(System.in);
//  System.out.println("Enter the size of table:");
//  n=in.nextInt();
//  for(int row=1;row<=n;row++) {
//	for(int col=1;col<=n;col++) {
//		if (col<=n/2+1)
//			System.out.print(col+" ");
//		else if (col>n/2)
//			System.out.print(n+1-col+" ");
//			}
//	System.out.println();
//		}
//	}
//}
//  **************increament for each cell***************
//  int n=3;
//  Scanner in=new Scanner(System.in);
//  System.out.println("Enter the size of table:");
//  n=in.nextInt();
//  int i=1;
//  for(int row=1;row<=n;row++) {
//	for(int col=1;col<=n;col++) {
//		
//			System.out.printf("%d ",i);
//			i++;
//			}
//	System.out.println();
//		}
//	}
//}
//  *************special*print 1 in odd rows*****************
//  int n=5;
//  Scanner in=new Scanner(System.in);
//  System.out.println("Enter the size of table:");
//  n=in.nextInt();
//  for(int row=1;row<=n;row++) {
//	for(int col=1;col<=n;col++) {
//		if(row%2!=0)
//			System.out.print("1 ");
//		else
//			System.out.print("0 ");
//			}
//	System.out.println();
//		}
//	}
//}
//  ***************************prin--1--n-odd-cols**************
//		int n=3;
//		//Scanner in=new Scanner(System.in);
//		//System.out.println("Enter the size of table:");
//		//n=in.nextInt();
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n;col++) {
//				if((row+col)%2!=0)
//					System.out.print("1 ");
//				else
//					System.out.print("0 ");
//					}
//			System.out.println();
//				}
//			}
//		}
//  *****************ABC in each row***************************
//		int n=3;
//		char a='A';
//		
//		//Scanner in=new Scanner(System.in);
//		//System.out.println("Enter the size of table:");
//		//n=in.nextInt();
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n;col++) {
//				System.out.print(a+" ");
//				a++;
//					}
//			System.out.println();
//			a='A';
//			
//				}
//			}
//		}
//  **************Alphabetical Order************************
//		int n=3;
//		char a='A';
//		
//		//Scanner in=new Scanner(System.in);
//		//System.out.println("Enter the size of table:");
//		//n=in.nextInt();
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n;col++) {
//				System.out.print(a+" ");
//				a++;
//					}
//			System.out.println();
//			}}}
//  *****************A-Alphabet----------------------
//		int n=7;
//		
//		//Scanner in=new Scanner(System.in);
//		//System.out.println("Enter the size of table:");
//		//n=in.nextInt();
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n;col++) {
//				if(col==1||row==1||col==n||row==n/2+1) 
//					System.out.print("* ");
//					else
//						System.out.print("  ");
//				}
//			System.out.println();
//					}
//			}}
//  ****************B Alphabet************************
//  int n=7;
//
//  Scanner in=new Scanner(System.in);
//  System.out.println("Enter the size of table:");
//  n=in.nextInt();
//  for(int row=1;row<=n;row++) {
//	for(int col=1;col<=n;col++) {
//		if(col==1||row==1||col==n||row==n/2+1||row==n) 
//			System.out.print("* ");
//			else
//				System.out.print("  ");
//		}
//	System.out.println();
//			}
//	}}
//  ********************C-Alphabet***********************
//  int n=7;
//		
//		//Scanner in=new Scanner(System.in);
//		//System.out.println("Enter the size of table:");
//		//n=in.nextInt();
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n;col++) {
//				if(col==1||row==1||row==n) 
//					System.out.print("* ");
//					else
//						System.out.print("  ");
//				}
//			System.out.println();
//					}
//			}}
//   ******************Right-angle-Triangle*******************
//   int n=7;
//		
//		//Scanner in=new Scanner(System.in);
//		//System.out.println("Enter the size of table:");
//		//n=in.nextInt();
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n;col++) {
//					if(col<=row)
//					System.out.print("* ");
//					else
//						System.out.print("- ");
//				}
//			System.out.println();
//					}
//			}}
//   ****************Right angle upper hollow triangle*********
//   int n=9;
//		
//		Scanner in=new Scanner(System.in);
//		System.out.println("Enter the size of table:");
//		n=in.nextInt();
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n;col++) {
//					if(col==row||col==1||row==n)
//					System.out.print("* ");
//					else
//						System.out.print(". ");
//				}
//			System.out.println();
//					}
//			}}
//  *************Left-angle-half-lower-triangle******************
//  int n=9;
//		
//		//Scanner in=new Scanner(System.in);
//		//System.out.println("Enter the size of table:");
//		//n=in.nextInt();
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n;col++) {
//					if(col+row>=n+1)
//					System.out.print("* ");
//					else
//						System.out.print(". ");
//				}
//			System.out.println();
//					}
//			}}
//  *************Left-angle-half-upper-hollow-triangle**********************
//  int n=11;
//		
//		//Scanner in=new Scanner(System.in);
//		//System.out.println("Enter the size of table:");
//		//n=in.nextInt();
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n;col++) {
//					if(col+row==n+1||row==n||col==n)
//					System.out.print("* ");
//					else
//						System.out.print(". ");
//				}
//			System.out.println();
//					}
//			}}
//  **************right-angle-half upper triangle**********************
//  int n=9;
//		
//		//Scanner in=new Scanner(System.in);
//		//System.out.println("Enter the size of table:");
//		//n=in.nextInt();
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n;col++) {
//					if(row<=col)
//					System.out.print("* ");
//					else
//						System.out.print("  ");
//				}
//			System.out.println();
//					}
//			}}
//  ---------------------Isoceles triangle------------------------------
//    int n=13;
//		
//		//Scanner in=new Scanner(System.in);
//		//System.out.println("Enter the size of table:");
//		//n=in.nextInt();
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=n;col++) {
//					if(row+col>=n+1) 
//							System.out.print("* ");
//						else
//							System.out.print(" ");
//						
//					
//				}
//			System.out.println();
//					}
//			}}
//  **************************************
    int n=17;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of table:");
		n=in.nextInt();
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
					if(row+col>n/2+1&&row+n/2>=col&&row<=n/2+1) 
							System.out.print("* ");
						else
							System.out.print(". ");
				}
			System.out.println();
					}in.close();
			}}
