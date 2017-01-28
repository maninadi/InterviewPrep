package Arrays;

import java.util.*;

/*
 * 	
	Given a sorted array of integers, find the starting and ending position of a given target value.
	Your algorithm’s runtime complexity must be in the order of O(log n).
	If the target is not found in the array, return [-1, -1].
	Example:
	Given [5, 7, 7, 8, 8, 10]
	and target value 8,
	return [3, 4].

 */

public class SearchRange {

	public static void main(String[] args){
		
		int[] a={5, 7, 7, 8, 8, 10};
		
		int[] res=searchRange(a,8);
		
		System.out.println(Arrays.toString(res));
		
		
	}
	
	static int[] searchRange(int[] a, int b) {
	    
	    int start=-1;
	    int end=-1;
	    
	    int low=0;
	    int high=a.length-1;
	    int mid=(low+high)/2;
	    int[] res=new int[2];
	    while(low<=high){
	        if(a[mid]>b){
	            high=mid-1;
	        }
	        else if(a[mid]<b){
	            low=mid+1;
	        }
	        else{
	            start=mid;
	            high=mid-1;
	        }
	        mid=(low+high)/2;
	    }
	    
	    if(start==-1){
	        res[0]=start;
	        res[1]=end;
	        return res;
	    }
	    
	    low=start+1;
	    end=start;
	    high=a.length-1;
	    mid=(low+high)/2;
	    while(low<=high){
	        if(a[mid]>b){
	            high=mid-1;
	        }
	        else{
	            end=mid;
	            low=mid+1;
	        }
	        mid=(low+high)/2;
	    }
	    
	    res[0]=start;
	    res[1]=end;
	    
	    return res;
	    
	}
}
