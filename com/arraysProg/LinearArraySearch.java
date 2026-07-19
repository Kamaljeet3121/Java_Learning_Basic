package com.arraysProg;

public class LinearArraySearch {
	public static void main(String[] args) {
//		int[] a= {10,20,30,40,50,60,70,80,90};
//		int input=70;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==input){
//				System.out.println("Element Present at index: "+i);
//				break;
//			}
//			else if(i==a.length-1)
//				System.out.println("Element not found");
//		}
//	}
//}

		int[] a= {10,20,30,40,50,20,20,80,90};
		int input=2,count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==input){
				System.out.println("Element Present at index: "+i);
				count++;
			}
			else if(i==a.length-1&&count==0)
				System.out.println("Element not found");
		}
	}
}
		
//		int[] a= {10,20,30,40,50,60,70,80,90};
//		int input=70;
//		for(int i=0;i<(a.length/2)+1;i++) {
//			if(a[i]==input||a[a.length-1-i]==input){
//				System.out.println("Element Present");
//				break;
//			}
//			else if(i==(a.length/2)+1)
//				System.out.println("Element not found");
//		}
//	}
//}