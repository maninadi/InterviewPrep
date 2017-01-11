package Arrays;

import java.util.*;

public class LargestSubArrayWithEqual0sand1s {
	
	public static void main(String[] args){
		int[] arr={1, 0, 1, 1, 1, 0, 0};
		System.out.println(findMaxLength(arr));
		
		int[] arr1={1, 1, 1, 1, 1, 1, 1};
		System.out.println(findMaxLength(arr1));
		
		int[] arr2={0, 0, 1, 1, 0};
		System.out.println(findMaxLength(arr2));
	}

	static int findMaxLength(int[] arr){
		
		int maxLen=0;
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int sum=0;
		for(int i=0;i<arr.length;i++){
			int k=arr[i]<=0?-1:1;
			sum+=k;
			if(sum==0){
				maxLen=Math.max(maxLen, i+1);
			}
			else if(hm.containsKey(sum)){
				maxLen=Math.max(maxLen, i-hm.get(sum));
			}
			else{
				hm.put(sum, i);
			}
		}
		
		return maxLen;
	}
}
