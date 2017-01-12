package Arrays;

import java.util.*;

public class MaxJAndI {

	public static void main(String[] args){
		
		int[] arr={34, 8, 10, 3, 2, 80, 30, 33, 1};
		
		System.out.println(maxJandI(arr));
	}
	
	static int maxJandI(int[] arr){
		
		int max=Integer.MIN_VALUE;
		int n=arr.length;
		int[] mins=new int[n];
		int[] maxs=new int[n];
		
		Arrays.fill(mins, Integer.MAX_VALUE);
		Arrays.fill(maxs, Integer.MIN_VALUE);
		mins[0]=arr[0];
		for(int i=1;i<n;i++){
			mins[i]=Math.min(mins[i-1],arr[i]);
		}
		
		maxs[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--){
			maxs[i]=Math.max(maxs[i+1], arr[i]);
		}
		
		int i=0,j=0;
		while(i<n && j<n){
			if(maxs[j]>mins[i]){
				max=Math.max(max, j-i);
				j++;
			}
			else{
				i++;
			}

		}
		
		
		return max;
	}
}
