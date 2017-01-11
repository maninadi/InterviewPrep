package Arrays;

import java.util.*;

public class LongestIncSubSeq {

	public static void main(String[] args){
		
		int[] arr={100, 4, 200, 1, 3, 2, 5, 0,6,8,7};
		
		System.out.println(lis(arr));
	}
	
	
	static int lis(int[] arr){
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			max=Math.max(max, arr[i]);
			min=Math.min(min, arr[i]);
		}
		
		boolean[] lis=new boolean[max-min+1];
		
		for(int i=0;i<arr.length;i++)
			lis[arr[i]-min]=true;
		
		int count=0;
		max=Integer.MIN_VALUE;
		for(int i=0;i<lis.length;i++){
			if(lis[i]){
				count++;
			}
			else{
				max=Math.max(count, max);
				count=0;
			}
		}
		return max;
			
	}
}
