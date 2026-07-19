package com.arraysProg;

public class SubArraysExp {
	public static void main(String[] args) {
		int [] nums= {5,4,-1,7,8};
//		 int max=0;
//	        for(int i=0;i<nums.length;i++){
//		            for(int j=i;j<nums.length;j++){
//	                    int sum=0;
//		                for(int k=i;k<=j;k++){
//	                        sum+=nums[k];
//	                }if(sum>max)
//	                max=sum;
//	            }
//	        }System.out.println(max);
//	    }
//	
//	}
//************************
		int sum =nums[0];
		int maxsum=nums[0];
		for (int i=1;i<nums.length;i++){
			if(sum<0) {
				sum=nums[i];
				
			}else {
				sum+=nums[i];
				maxsum=Math.max(maxsum, sum);
			}
			
		}System.out.println(maxsum);
	}
}
