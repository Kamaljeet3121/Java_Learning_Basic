package com.patternProg;

import java.util.Scanner;

public class TrianglePattern {
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the Size(min 5):");
			int n=in.nextInt();
			if(n>=5) {
				rightAngleTriangle(n);
				System.out.println();
				rightAngleHollowTriangle(n);
				System.out.println();
				leftAngleTriangle(n);
				System.out.println();
				leftAngleHollowTriangle(n);
				System.out.println();
				rightAngleUpperTriangle(n);
				System.out.println();
				isocellesTriangle(n);
				System.out.println();
				isocellesTriangle2(n);
				System.out.println();
				rightAnglePascalTriangle(n);
				System.out.println();
				rightAngleHollowPascalTriangle(n);
				System.out.println();
				rightAngleInversePascalTriangle( n);
				System.out.println();
				rightAngleInverseHollowPascalTriangle( n);
				System.out.println();
				leftAnglePascalTriangle( n);
				System.out.println();
				leftAngleHollowPascalTriangle( n);
				System.out.println();
				leftAngleInversePascalTriangle( n);
				System.out.println();
				leftAngleInverseHollowPascalTriangle( n);
				System.out.println();
				upSidedTriangle( n);
				System.out.println();
				upSidedHollowTriangle(n);
				System.out.println();
				upSidedInverseTriangle(n);
				System.out.println();
				upSidedInverseHollowTriangle( n);
				System.out.println();
				downSidedTriangle( n);
				System.out.println();
				downSidedHollowTriangle( n);
				System.out.println();
				downSidedInverseTriangle(n);
				System.out.println();
				downSidedInverseHollowTriangle(n);
				in.close();
			}
		}
	public static void rightAngleTriangle(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
					if(col<=row)
					System.out.print("* ");
					else
						System.out.print("  ");
				}
			System.out.println();
					}
			
	}
	public static void rightAngleHollowTriangle(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
					if(col==row||col==1||row==n)
					System.out.print("* ");
					else
						System.out.print("  ");
				}
			System.out.println();
					}
	}
	public static void leftAngleTriangle(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
					if(col+row>=n+1)
					System.out.print("* ");
					else
						System.out.print("  ");
				}
			System.out.println();
					}
	}
	public static void leftAngleHollowTriangle(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
					if(col+row==n+1||row==n||col==n)
					System.out.print("* ");
					else
						System.out.print("  ");
				}
			System.out.println();
					}
	}
	public static void rightAngleUpperTriangle(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
					if(row<=col)
					System.out.print("* ");
					else
						System.out.print("  ");
				}
			System.out.println();
					}
	}
	public static void isocellesTriangle(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
					if(row+col>=n+1) 
							System.out.print("* ");
						else
							System.out.print(" ");
				}
			System.out.println();
					}
	}
	public static void isocellesTriangle2(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
					if(row+col>n/2+1&&row+n/2>=col&&row<=n/2+1) 
							System.out.print("* ");
						else
							System.out.print("  ");
				}
			System.out.println();
		}
	}
	public static void rightAnglePascalTriangle(int n) {
		for(int row =1;row<=n*2-1;row++) {
			for(int col=1;col<=n;col++) {
				if(row>=col&&row+col<=n*2) {
					System.out.print("* ");
				}else System.out.print("  ");
			}System.out.println();
		}
	}
	
	public static void rightAngleHollowPascalTriangle(int n) {
		for(int row =1;row<=n*2-1;row++) {
			for(int col=1;col<=n;col++) {
				if(row==col||row+col==n*2||col==1) {
					System.out.print("* ");
				}else System.out.print("  ");
			}System.out.println();
		}
	}
	public static void rightAngleInversePascalTriangle(int n) {
		for(int row =1;row<=n*2-1;row++) {
			for(int col=1;col<=n;col++) {
				if(row<=col||row+col>=n*2) {
					System.out.print("* ");
				}else System.out.print("  ");
			}System.out.println();
		}
	}
	public static void rightAngleInverseHollowPascalTriangle(int n) {
	for(int row =1;row<=n*2-1;row++) {
		for(int col=1;col<=n;col++) {
				if(row==col||row+col==n*2||row==1||row==n*2-1||col==n) {
				System.out.print("* ");
				}else System.out.print("  ");
			}System.out.println();
		}
	}
	public static void leftAnglePascalTriangle(int n) {
		for(int row =1;row<=n*2-1;row++) {
			for(int col=1;col<=n;col++) {
				if(row+col>=n+1&&row-col<=n-1) {
					System.out.print("* ");
				}else System.out.print("  ");
			}System.out.println();
		}
	}
	public static void leftAngleHollowPascalTriangle(int n) {
		for(int row =1;row<=n*2-1;row++) {
			for(int col=1;col<=n;col++) {
				if(row+col==n+1||row-col==n-1||col==n) {
					System.out.print("* ");
				}else System.out.print("  ");
			}System.out.println();
		}
	}
	public static void leftAngleInversePascalTriangle(int n) {
		for(int row =1;row<=n*2-1;row++) {
			for(int col=1;col<=n;col++) {
				if(row+col<=n+1||row-col>=n-1) {
					System.out.print("* ");
				}else System.out.print("  ");
			}System.out.println();
		}
	}
	public static void leftAngleInverseHollowPascalTriangle(int n) {
		for(int row =1;row<=n*2-1;row++) {
			for(int col=1;col<=n;col++) {
				if(row+col==n+1||row-col==n-1||row==1||row==n*2-1||col==1) {
					System.out.print("* ");
				}else System.out.print("  ");
			}System.out.println();
		}
	}
	public static void upSidedTriangle(int n) {
		for(int row =1;row<=n;row++) {
			for(int col=1;col<=n*2-1;col++) {
				if(row+col>=n+1&&col-row<=n-1) {
					System.out.print("* ");
				}else System.out.print("  ");
			}System.out.println();
		}
	}
	public static void upSidedHollowTriangle(int n) {
		for(int row =1;row<=n;row++) {
			for(int col=1;col<=n*2-1;col++) {
				if(row+col==n+1||col-row==n-1||row==n) {
					System.out.print("* ");
				}else System.out.print("  ");
			}System.out.println();
		}
	}
	public static void upSidedInverseTriangle(int n) {
		for(int row =1;row<=n;row++) {
			for(int col=1;col<=n*2-1;col++) {
				if(row+col<=n+1||col-row>=n-1) {
					System.out.print("* ");
				}else System.out.print("  ");
			}System.out.println();
		}
	}
	public static void upSidedInverseHollowTriangle(int n) {
		for(int row =1;row<=n;row++) {
			for(int col=1;col<=n*2-1;col++) {
				if(row==1||col==1||col==n*2-1||row+col==n+1||row+n-1==col) {
					System.out.print("* ");
				}else System.out.print("  ");
			}System.out.println();
		}
	}
	public static void downSidedTriangle(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n*2-1;col++) {
				if(row<=col&&row+col<=n*2)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}System.out.println();
		}
	}
	public static void downSidedHollowTriangle(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n*2-1;col++) {
				if(row==col||row+col==n*2||row==1)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}System.out.println();
		}
	}
	public static void downSidedInverseTriangle(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n*2-1;col++) {
				if(row>=col||row+col>=n*2)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}System.out.println();
		}
	}
	public static void downSidedInverseHollowTriangle(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n*2-1;col++) {
				if(row==col||row+col==n*2||row==n||col==1||col==2*n-1)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}System.out.println();
		}
	}
}



