package Arrays;

import java.util.*;

public class AllocateEqualPages {

	public static void main(String[] args){
		
		int[] a={4, 31, 14, 19, 75};
		
		System.out.println(books(a,12));
		
		
	}
	
	static int books(int[] a, int b) {
	    
		if(a.length<b)
			return -1;
	    
	    int sum=0;
	    for(int i:a)
	        sum+=i;
	   
	    int low=0;
	    int high=sum;
	    
	    int ans=Integer.MAX_VALUE;
	    while(low<=high){
	        int mid=(low+high)/2;
	        if(canBeSplit(a,b,mid)){
	            ans=Math.min(ans,mid);
	            high=mid-1;
	        }
	        else{
	            low=mid+1;
	        }
	    }
	    
	    return ans==Integer.MAX_VALUE?-1:ans;
	    
	}
	
	static boolean canBeSplit(int[] a,int b,int min){
	    
	    int runningSum=0;
	    
	    int count=1;
	    for(int i:a){
	        
	        if(i>min)
	            return false;
	        
	        if(runningSum+i>min){
	            count++;
	            if(count>b)
	                return false;
	            runningSum=i;
	        }
	        else {
	            runningSum+=i;
	        }
	    }
	    return true;
	}
	
}
