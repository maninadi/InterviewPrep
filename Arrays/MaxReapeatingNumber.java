package Arrays;

import java.util.*;

public class MaxReapeatingNumber {

	public static void main(String[] args){
		int[] arr = {1, 2, 2, 2, 0, 2, 0, 2, 3, 8, 0, 9, 2, 3};
		System.out.println(maxRepeatingNumber(arr));
		System.out.println(maxRepeatingNumber(arr,9));
	}
	
	
	static int maxRepeatingNumber(int[] arr){
		
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++){
			max=Math.max(max, arr[i]);
			min=Math.min(min, arr[i]);
		}
		
		int[] counts=new int[max+1];
		max=Integer.MIN_VALUE;
		int maxNum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			counts[arr[i]]++;
			if(max<counts[arr[i]]){
				max=counts[arr[i]];
				maxNum=arr[i];
			}
				
		}
		
		return maxNum;
	}
	
	
	static int maxRepeatingNumber(int[] arr,int k){
		
		for(int i=0;i<arr.length;i++){
			arr[arr[i]%k]+=k;
		}
		
		int max=Integer.MIN_VALUE;
		int maxNum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
				maxNum=i;
			}
		}
		
		return maxNum;
	}
}
