package Arrays;

import java.util.*;

public class MinSubArrayToSort {

	public static void main(String[] args){
	
		//int[] arr={10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
		int[] arr={0, 1, 15, 25, 6, 7, 30, 40, 50};
		minSubArray(arr);
		
	}
	static void minSubArray(int[] arr){
		
				
		int i=1;
		for(;i<arr.length-1;i++){
			if(arr[i-1]>arr[i])
				break;
		}
		
		int left=i-1;
		i=arr.length-2;
		for(;i>=0;i--){
			if(arr[i+1]<arr[i])
				break;
		}
		
		int right=i+1;
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(i=left;i<=right;i++){
			max=Math.max(max, arr[i]);
			min=Math.min(min, arr[i]);
		}
		
		while(left>=0 && arr[left]>min)
			left--;
		
		while(right<arr.length && arr[right]<max)
			right++;
	
		System.out.println((left+1)+" "+(right-1));
	}
}
