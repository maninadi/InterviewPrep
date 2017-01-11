package Arrays;

import java.util.*;

public class LongestIncreasingSubsequence {

	public static void main(String[] args){
		int[] arr={ 10, 22, 9, 33, 21, 50, 41, 60, 80 } ;
		System.out.println(maxLis(arr));
	}
	
	
	static int maxLis(int[] arr){
		
		int n=arr.length;
		int[] lis=new int[n];
		
		Arrays.fill(lis,1);
		int maxLen=0;
		
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				if(arr[i]>arr[j] && lis[i]<lis[j]+1){
					lis[i]=lis[j]+1;
				}
			}
		}
		
		for(int i=0;i<n;i++)
			maxLen=Math.max(maxLen, lis[i]);
		
		return maxLen;
		
	}
}
