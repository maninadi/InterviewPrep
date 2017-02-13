package Arrays;

import java.util.*;

/*
 * You are given a read only array of n integers from 1 to n.

	Each integer appears exactly once except A which appears twice and B which is missing.
	
	Return A and B.
	
	Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
	
	Note that in your output A should precede B.
	
	Example:
	
	Input:[3 1 2 5 3] 
	
	Output:[3, 4] 
	
	A = 3, B = 4
 */


public class MissingAndRepeating {

	public static void main(String[] args){
		int[] arr={3, 1, 2, 5, 3};
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i:arr){
			a.add(i);
		}
		
		for(int i:findValues(a)){
			System.out.format("%d ", i);
		}
	}
	
	
	static ArrayList<Integer> findValues(ArrayList<Integer> a){
		
		ArrayList<Integer> res=new ArrayList<Integer>();
		
		for(int i=0;i<a.size();i++){
			
			int k=a.get(i);
			k=Math.abs(k);
			if(a.get(k-1)<0){
				res.add(k);
			}
			else{
				a.set(k-1, -1*(a.get(k-1)));	
			}
		}
		for(int i=0;i<a.size();i++){
			if(a.get(i)>0){
				res.add(i+1);
				break;
			}
		}
		return res;
	}
	
	
}
