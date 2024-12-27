package com.sm.projectArray;

public class DemoArraySum {

	 public int findSumArray(int[] arr) {
	        int sum = 0;
	        for (int num : arr) {
	            sum += num;
	        }
	        return sum;
	    }

	    
	    public int findMaxArray(int[] arr) {
	        if (arr == null || arr.length == 0) {
	            throw new IllegalArgumentException("Array cannot be null or empty");
	        }

	        int max = arr[0];
	        for (int num : arr) {
	            if (num > max) {
	                max = num;
	            }
	        }
	        return max;
	    }
	public static void main(String[] args) {
		
		DemoArraySum ob=new DemoArraySum();
		int arr[]= {4,2,7,5,8,6};
		int s=ob.findSumArray(arr);
		System.out.println(s);
		int m=ob.findMaxArray(arr);
		System.out.println(m);
	}

}
