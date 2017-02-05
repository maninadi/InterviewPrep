package Arrays;

import java.util.*;

/*
 * Remove Duplicates from Sorted Array

	Given a sorted array, remove the duplicates in place such that each element can appear atmost twice and return the new length.
	
	Do not allocate extra space for another array, you must do this in place with constant memory.
	
	Note that even though we want you to return the new length, make sure to change the original array as well in place
	
	For example,
	Given input array A = [1,1,1,2],
	
	Your function should return length = 3, and A is now [1,1,2].
 */

public class RemoveDuplicates {

	public static void main(String[] args){
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(2);
		a.add(2);
		a.add(2);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(4);
		
		removeDuplicates(a);
		for(int i:a)
			System.out.print(i+" ");
	}
	
	
	static int removeDuplicates(ArrayList<Integer> a){
	    int loc=1;
	    int i=1;
	    int b=a.get(0);
	    int cnt=1;
	    while(i<a.size()){
	        int k=a.get(i);
	        if(k!=b || cnt<2){
	            a.set(loc,k);
	            loc++;
	            
	            if(k!=b)
	            	cnt=0;
	            b=k;
	        }
	        cnt++;
	        i++;
	    }
	    a.subList(loc,a.size()).clear();
	    return a.size();
	}
}
