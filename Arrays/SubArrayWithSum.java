package Arrays;

import java.util.*;

public class SubArrayWithSum {
	
	public static void main(String[] args){
		//int[] arr={1, 4, 20, 3, 10, 5};
		//int[] arr={1, 4, 0, 0, 3, 10, 5};
		int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
		subArray(arr, 23);
	}
	
	static void subArray(int[] arr,int k){
		
		int start=0;
		int end=arr.length;
		int sum=0;
		int i=0;
		while(i<end){
			sum+=arr[i];
			while(sum>k && start<i){
				sum-=arr[start];
				start++;
			}
			if(sum==k){
				System.out.print(start+" "+i);
				return;
			}
			i++;
		}
		
		
	}

}
