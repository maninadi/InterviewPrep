package Arrays;

import java.util.*;

/*
 * N number of books are given. 
	The ith book has Pi number of pages. 
	You have to allocate books to M number of students so that maximum number of pages alloted to a student is minimum. A book will be allocated to exactly one student. Each student has to be allocated at least one book. Allotment should be in contiguous order, for example: A student cannot be allocated book 1 and book 3, skipping book 2.
	
	NOTE: Return -1 if a valid assignment is not possible
	
	Input:
	 List of Books M number of students 
	
	Your function should return an integer corresponding to the minimum number.
	
	Example:
	
	P : [12, 34, 67, 90]
	M : 2
	
	Output : 113
	
	There are 2 number of students. Books can be distributed in following fashion : 
	  1) [12] and [34, 67, 90]
	      Max number of pages is allocated to student 2 with 34 + 67 + 90 = 191 pages
	  2) [12, 34] and [67, 90]
	      Max number of pages is allocated to student 2 with 67 + 90 = 157 pages 
	  3) [12, 34, 67] and [90]
	      Max number of pages is allocated to student 1 with 12 + 34 + 67 = 113 pages
	
	Of the 3 cases, Option 3 has the minimum pages = 113.
 */

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
