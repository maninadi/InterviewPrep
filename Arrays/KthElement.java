package Arrays;

import java.util.*;

public class KthElement {
	
	public static void main(String[] args){
		
		int[] arr={1,4,6,2,3};
		System.out.println(KthElement(arr,5));
	}

	
	static int KthElement(int[] arr,int k){
		int low=0;
		int hi=arr.length-1;
		k--;
		int pos=0;
		while(low<hi){
			pos=partition(arr,low,hi);
			if(pos==k){
				return arr[k];
			}else if(k<pos){
				hi=pos-1;
			}
			else{
				low=pos+1;
			}
		}
		return arr[low];
	}

	private static int partition(int[] arr, int low, int hi) {
		int pivot=low;
		
		while(low<hi){
			while(low<hi && arr[low]<arr[pivot])
				low++;
			while(low<hi && arr[hi]>=arr[pivot])
				hi--;
			if(hi>low)
				swap(arr,low,hi);
			
		}
		if(hi>low)
			swap(arr,hi,pivot);
		return hi;
	}
	
	private static void swap(int[] arr,int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
