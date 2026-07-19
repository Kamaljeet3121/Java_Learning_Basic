package com.arraysProg;

import java.util.Arrays;

public class CentreAvg {
	public static void main(String[] args) {
		int[] a= {1,254,99,6,10,5};
		System.out.println(centeredAverage(a));
	}
	public static int centeredAverage(int[] nums) {
		  int sum=0,i=1;
		  Arrays.sort(nums);
		  if (nums.length==3)
		  return nums[1];
		  else {
		  for(i=1;i<nums.length-1;i++){
		    sum+=nums[i];
		  }
		    return sum/(i-1);
		  }
		}
}
